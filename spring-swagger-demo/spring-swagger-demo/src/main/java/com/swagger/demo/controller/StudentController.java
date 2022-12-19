package com.swagger.demo.controller;

import com.swagger.demo.entity.Student;
import com.swagger.demo.serviceimpl.StudentServiceImpl;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@OpenAPIDefinition(info = @Info(description = "This resourse will give you student details",title = "Student Service",version = "v1"))
public class StudentController {

    @Autowired
    private StudentServiceImpl studentServiceImpl;

    @ApiResponse(description = "Student detais found successfully",responseCode = "200")
    @GetMapping("/studentAll")
    public List< Student> getAllStudent(){
        return  studentServiceImpl.getStudentDetails();
    }

    @ApiResponse(description = "Student detais found  based on Student idsuccessfully",responseCode = "200")
    @GetMapping("/student/{studentId}")
    public Student getStudentById(Long studentId){
        return  studentServiceImpl.findByStudentId(studentId);

    }

}
