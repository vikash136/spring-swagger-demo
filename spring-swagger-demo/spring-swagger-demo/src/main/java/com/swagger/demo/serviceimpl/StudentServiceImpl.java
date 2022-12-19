package com.swagger.demo.serviceimpl;

import com.swagger.demo.entity.Student;
import com.swagger.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl {

    @Autowired
    private StudentRepository studentRepository;

    public List< Student>getStudentDetails(){
        return studentRepository.findAll();
    }

    public Student findByStudentId(Long studentId){
        return studentRepository.findById(studentId).get();
    }




}
