package com.virtual.course.service.courseservices.exception;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.concurrent.RejectedExecutionHandler;
@ControllerAdvice
public class CustomizedExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleAppException(Exception ex, WebRequest request) throws Exception {
        ExceptionDescription exceptionDescription = new ExceptionDescription(ex.getMessage(), request.getDescription(false));
        return new ResponseEntity(exceptionDescription, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @Override
    public  ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        ExceptionDescription exceptionDescription = new ExceptionDescription(ex.getFieldError().getDefaultMessage(), request.getDescription(false));
        return new ResponseEntity(exceptionDescription, HttpStatus.BAD_REQUEST);
    }
}
