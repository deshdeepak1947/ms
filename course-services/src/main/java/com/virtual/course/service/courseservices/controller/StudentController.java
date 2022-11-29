package com.virtual.course.service.courseservices.controller;
import com.virtual.course.service.courseservices.configuration.CourseConfiguration;
import com.virtual.course.service.courseservices.entity.Course;
import com.virtual.course.service.courseservices.entity.Student;
import com.virtual.course.service.courseservices.exception.CourseNotFoundException;
import com.virtual.course.service.courseservices.repository.CourseRepository;
import com.virtual.course.service.courseservices.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.Optional;
@RestController
public class StudentController {
    private Logger logger = LoggerFactory.getLogger(StudentController.class);
    @Autowired
    CourseConfiguration courseConfiguration;
    @Autowired
    CourseRepository courseRepository;
    @Autowired
    StudentRepository studentRepository;

    @PostMapping("/course/{courseId}/students")
    public Student createStudentForCourse(@PathVariable Integer courseId, @Valid @RequestBody Student student) {
        logger.info("running on port: {}",courseConfiguration.getPort());

        Optional<Course> course = courseRepository.findById(courseId);
        if(course.isEmpty()){
            throw new CourseNotFoundException("course not found with Id:"+courseId);
        }
       student.setCourse(course.get());
        Student createdStudent = studentRepository.save(student);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{courseId}").
                buildAndExpand(createdStudent.getStudentId()).toUri();
        return createdStudent;
    }
}
