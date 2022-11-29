package com.virtual.course.service.courseservices.service;
import com.virtual.course.service.courseservices.request.Course;

import java.util.List;
import java.util.Optional;
public interface CourseService {
    List<Course> findAll();
    Course findById(Integer courseId);
    void deleteById(Integer courseId);
    Course save(Course course);
}
