package com.virtual.course.service.courseservices.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;
@Getter
@Setter
@Entity
public class Course {
    @Id
    @GeneratedValue
    @Column(name="course_id")
    private Integer courseId;
    private String couserName;
    private String courseDescription;
    @OneToMany(mappedBy = "course")
//   / @JsonIgnore
    private List<Student> students;
}
