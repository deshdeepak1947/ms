package com.virtual.course.service.courseservices.dao;

import com.virtual.course.service.courseservices.pojo.course.Course;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
@Component
//@Repository
public class CourseDaoImpl {/*
    private static List<Course> courses = new ArrayList<>();
    private static int courseCount=0;
    static {
        courses.add(new Course(++courseCount, "MCA", "computer app"));
        courses.add(new Course(++courseCount, "MBA", "Business topics"));
        courses.add(new Course(++courseCount, "PHD", "inter university"));
    }

    public List<Course> findAll(){
        return courses;
    }

    public Course findCourse(Integer courseId){
        Predicate<? super Course>  predicate  =  course -> course.getCourseId().equals(courseId);
        return courses.stream().filter(predicate).findFirst().orElse(null);
    }
    public Course saveCourse(Course course){
        course.setCourseId(++courseCount);
        courses.add(course);
        return course;
    }

    public void  deleteCourse(Integer courseId){
        Predicate<? super Course>  predicate  =  course -> course.getCourseId().equals(courseId);
        courses.removeIf(predicate);
    }*/
}
