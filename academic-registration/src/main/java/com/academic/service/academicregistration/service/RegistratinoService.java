package com.academic.service.academicregistration.service;
import com.academic.service.academicregistration.beans.CadidateApplication;
import com.academic.service.academicregistration.beans.Student;
import com.academic.service.academicregistration.proxy.client.CourseServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class RegistratinoService {
    @Autowired
    CourseServiceClient courseServiceClient;
    public Student register(CadidateApplication cadidateApplication) {
        // register student in db
        // create registration id
        String studentName = cadidateApplication.getCandidateName();
        Student candidate = new Student();
        candidate.setStudentName(studentName);
        return courseServiceClient.register(cadidateApplication.getCourseId(), candidate);
    }
}
