package com.academic.service.academicregistration.beans;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CadidateApplication {
    private String candidateName;
    private int courseId;
}
