package com.swagger.demo;

import com.swagger.demo.entity.Student;
import com.swagger.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSwaggerDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringSwaggerDemoApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		Student std1=new Student(1L,"Dilip","soni");
		Student std2=new Student(2L,"vikash","singh");
		studentRepository.save(std1);
		studentRepository.save(std2);


	}
}
