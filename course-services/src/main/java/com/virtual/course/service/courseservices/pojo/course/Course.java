package com.virtual.course.service.courseservices.pojo.course;
import com.virtual.course.service.courseservices.entity.Student;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;
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