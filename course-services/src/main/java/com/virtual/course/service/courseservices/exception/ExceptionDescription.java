package com.virtual.course.service.courseservices.exception;
public class ExceptionDescription {
    private String message;
    private String details;
    public ExceptionDescription(String message, String details) {
        this.message = message;
        this.details = details;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getDetails() {
        return details;
    }
    public void setDetails(String details) {
        this.details = details;
    }
}
