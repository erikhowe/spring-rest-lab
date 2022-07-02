package com.example.payroll;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class EmployeeNotFoundAdvice {
    // Advice is rendered into the response body
    @ResponseBody
    // Configures the advice to respond only if a specified exception type is thrown
    @ExceptionHandler(EmployeeNotFoundException.class)
    // Respond with the specified HTTP status
    @ResponseStatus(HttpStatus.NOT_FOUND)
    // Generates the content
    String employeeNotFoundHandler(EmployeeNotFoundException ex) {
        return ex.getMessage();
    }
}