package com.virtual.course.service.courseservices.repository;
import com.virtual.course.service.courseservices.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

}
