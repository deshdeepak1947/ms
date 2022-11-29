package com.virtual.course.service.courseservices.service;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.virtual.course.service.courseservices.repository.CourseRepository;
import com.virtual.course.service.courseservices.request.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import java.util.Optional;
@Service
public class CourseServiceImpl implements  CourseService{
    @Autowired
    private CourseRepository courseRepository;
    @Override
    public List<Course> findAll() {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Course> courses = null;
        try {
            courses =  objectMapper.readValue(objectMapper.writeValueAsString(courseRepository.findAll()), List.class)  ;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return courses;
    }
    @Override
    public Course findById(Integer courseId) {
        ObjectMapper objectMapper = new ObjectMapper();
        Course course = null;
        try {
            course =  objectMapper.readValue(objectMapper.writeValueAsString(courseRepository.findById(courseId).get()), Course.class)  ;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return course;
    }
    @Override
    public void deleteById(Integer courseId) {
        courseRepository.deleteById(courseId);
    }
    @Override
    public Course save(Course course) {
        ObjectMapper objectMapper = new ObjectMapper();
        Course createdCourse = null;
        try {
            //objectMapper.writeValueAsString(course);
            com.virtual.course.service.courseservices.entity.Course course1 =  objectMapper.readValue(objectMapper.writeValueAsString(course),
                    com.virtual.course.service.courseservices.entity.Course.class);
            course1 = courseRepository.save(course1);


            createdCourse = objectMapper.readValue(objectMapper.writeValueAsString(course1), Course.class);

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        return createdCourse;
    }
}
