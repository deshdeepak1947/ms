package com.academic.service.academicregistration.entity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity(name="registration_master")
@Getter
@Setter
public class Registration {
    @Id
    @GeneratedValue
    @Column(name = "registration_id")
    private int registrationId;
    @Column(name = "candidate_name")
    private String candidateName;
    @Column(name="course_id")
    private int courseId;
}
