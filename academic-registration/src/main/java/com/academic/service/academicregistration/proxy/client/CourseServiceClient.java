package com.academic.service.academicregistration.proxy.client;
import com.academic.service.academicregistration.beans.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//@FeignClient(name="course-service", url = "localhost:9193") //localhost:9193/course/3/students
@FeignClient(name="course-service")
public interface CourseServiceClient {
    @PostMapping("/course/{courseId}/students")
    Student register(@PathVariable int courseId, @RequestBody Student studentName);
}
