package com.virtual.course.service.courseservices.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Entity(name="student")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonRootName("Student")
public class Student {
    @Id
    @GeneratedValue
    private Integer studentId;
    private String studentName;
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Course course;
}
