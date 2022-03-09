package com.springboot.first.app.controllers;

import java.util.ArrayList;
import java.util.List;

import com.springboot.first.app.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	
	// http://localhost:8080/student
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Solomon", "Birichani");
	}

	@GetMapping("/students")
	public List<Student> getStudents(){		
		List<Student> students = new ArrayList<>();
		students.add(new Student("Solomon", "Birichani"));
		students.add(new Student("Tony", "Cena"));
		students.add(new Student("John", "Birichani"));
		students.add(new Student("Solo", "Juma"));
		students.add(new Student("Faith", "Birichani"));
		return students;
	}
	
	// http://localhost:8080/student/1
	// @PathVariable annotation
	@GetMapping("/student/{firstName}/{lastName}/")
	public Student studentPathVariable(@PathVariable("firstName") String firstName, 
			@PathVariable("lastName") String lastName) {
		return new Student(firstName, lastName);
	}
	
	// build rest API to handle query parameters
	// http://localhost:8080/student/query?firstName=Solomon&lastName=Birichani
	@GetMapping("/student/query")
	public Student studentQueryParam(
			@RequestParam(name = "firstName") String firstName,
			@RequestParam(name = "lastName") String lastName) {
		return new Student(firstName, lastName);
	}
	
	
	
}
