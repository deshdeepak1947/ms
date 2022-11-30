package com.academic.service.academicregistration.controller;
import com.academic.service.academicregistration.beans.CadidateApplication;
import com.academic.service.academicregistration.beans.Student;
import com.academic.service.academicregistration.proxy.client.CourseServiceClient;
import com.academic.service.academicregistration.service.RegistratinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class RegistrationController {
    @Autowired
    RegistratinoService registratinoService;
    @PostMapping("register")
    public Student registerStudent(@RequestBody CadidateApplication cadidateApplication){
        Student enrolledStudent = registratinoService.register(cadidateApplication);
        return enrolledStudent;
    }

}




/*
package com.academic.service.academicregistration.controller;
import com.academic.service.academicregistration.beans.CadidateApplication;
import com.academic.service.academicregistration.beans.Student;
import com.academic.service.academicregistration.proxy.client.CourseServiceClient;
import com.academic.service.academicregistration.service.RegistratinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class RegistrationController {
    @Autowired
    RegistratinoService registratinoService;
    @Autowired
    CourseServiceClient courseServiceClient;
    @PostMapping("reg")
    public Student registerStudent(@RequestBody CadidateApplication cadidateApplication){
        // register student in db
        // create registration id

        // take student name and course Id
        // invoke course service to create student for the subject
        int courseId = cadidateApplication.getCourseId();
        String studentName = cadidateApplication.getCandidateName();
        Student candidate = new Student();
        candidate.setStudentName(studentName);

        Student enrolledStudent = courseServiceClient.register(courseId, candidate);
        return enrolledStudent;
    }

}
*/
