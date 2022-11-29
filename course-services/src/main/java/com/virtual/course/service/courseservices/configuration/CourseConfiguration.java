package com.virtual.course.service.courseservices.configuration;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component
@ConfigurationProperties
@Getter
@Setter
public class CourseConfiguration {
    @Value("${server.port}")
    private int port;
}
