package com.virtual.course.service.courseservices.controller;
import com.virtual.course.service.courseservices.entity.Student;
import com.virtual.course.service.courseservices.exception.CourseNotCreatedException;
import com.virtual.course.service.courseservices.exception.CourseNotFoundException;
import com.virtual.course.service.courseservices.request.Course;
import com.virtual.course.service.courseservices.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;
@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;
    @GetMapping("/courses")
    public List<Course> retirevAllCourses(){

        return courseService.findAll();
    }
    @GetMapping("/courses/{courseId}")
    public Course retirevCourses(@PathVariable Integer courseId){
        Course course  =  courseService.findById(courseId);
        if(null == course){
            throw new CourseNotFoundException("courseNotFound"+courseId);
        }
        return course;
    }
    @DeleteMapping("/courses/{courseId}")
    public void deleteCourses(@PathVariable Integer courseId){
        courseService.deleteById(courseId);
    }
    @PostMapping("/courses")
    public Course createCourse(@Valid @RequestBody Course course){
        Course createdCourse = null;
        try{
            createdCourse = courseService.save(course);
        }catch(Exception e){
        }
        if(null == course){
            throw new CourseNotCreatedException("CourseNotCreatedException"+course.getCouserName());
        }
        return createdCourse;
    }
    @GetMapping("/courses/{courseId}/students")
    public List<Student> retirevStudentsForCourse(@PathVariable Integer courseId){
        Course course  =  courseService.findById(courseId);
        if(null == course){
            throw new CourseNotFoundException("courseNotFound"+courseId);
        }
        return course.getStudents();
    }
}



/*
package com.virtual.course.service.courseservices.controller;
import com.virtual.course.service.courseservices.entity.Course;
import com.virtual.course.service.courseservices.entity.Student;
import com.virtual.course.service.courseservices.exception.CourseNotFoundException;
import com.virtual.course.service.courseservices.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
@RestController
public class CourseController {
    @Autowired
    private CourseRepository courseRepository;

    @GetMapping("/courses")
    public List<Course> retirevAllCourses(){
        return courseRepository.findAll();
    }

    @GetMapping("/courses/{courseId}")
    public Course retirevCourses(@PathVariable Integer courseId){
        Optional<Course> course  =  courseRepository.findById(courseId);
        if(course.isEmpty()){
            throw new CourseNotFoundException("courseNotFound"+courseId);
        }
        return course.get();
    }

    @DeleteMapping("/courses/{courseId}")
    public void deleteCourses(@PathVariable Integer courseId){
        courseRepository.deleteById(courseId);
    }

    @PostMapping("/courses")
    public ResponseEntity<Course> createCourse(@Valid @RequestBody Course course){
        Course createdCourse = courseRepository.save(course);
        return ResponseEntity.created(null).build();
    }

    @GetMapping("/courses/{courseId}/students")
    public List<Student> retirevStudentsForCourse(@PathVariable Integer courseId){
        Optional<Course> course  =  courseRepository.findById(courseId);

        if(course.isEmpty()){
            throw new CourseNotFoundException("courseNotFound"+courseId);
        }
        Course course1 = course.get();
        return course1.getStudents();
    }

}
*/
