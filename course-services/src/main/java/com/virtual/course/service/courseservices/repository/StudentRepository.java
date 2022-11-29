package com.virtual.course.service.courseservices.repository;
import com.virtual.course.service.courseservices.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
