package com.virtual.course.service.courseservices.request;
import com.virtual.course.service.courseservices.entity.Student;
import lombok.*;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Course {
    private Integer courseId;
    private String couserName;
    private String courseDescription;
    private List<Student> students;
}