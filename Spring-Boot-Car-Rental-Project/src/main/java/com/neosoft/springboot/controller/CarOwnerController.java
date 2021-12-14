package com.neosoft.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.neosoft.springboot.entity.Car;





 @Controller
 public class CarOwnerController {

// 	@Autowired
// 	private CarOwnerServiceImpl carOwnerServiceImpl;
// 	
// 	@GetMapping("/students")
// 	public String listStudents(Model model) {
// 		
// 		model.addAttribute("students",carOwnerServiceImpl.getAllCars());
// 		
// 		return "students";
// 	}
// 	
// 	@GetMapping("/students/new")
// 	public String createStudentForm(Model model) {
// 		
// 		Car student = new Car();
// 		model.addAttribute("student", student);
// 		
// 		return "create_student";
// 	}
// 	
// 	@PostMapping("/students")
// 	public String saveStudent(@ModelAttribute("student") Student student) {
// 		
// 		carOwnerServiceImpl.saveStudent(student);
// 		
// 		return "redirect:/students";
// 	}
// 	
// 	@GetMapping("/students/edit/{id}")
// 	public String editStudentForm(@PathVariable Long id, Model model) {
// 		
// 		model.addAttribute("student",carOwnerServiceImpl.getStudentById(id));
// 		
// 		return "edit_student";
// 	}
// 	
// 	@PostMapping("/students/{id}")
// 	public String updateStudent(@PathVariable Long id, 
// 			@ModelAttribute("student") Student student,	Model model) {
// 		
// 		Student existingStudent = carOwnerServiceImpl.getStudentById(id);
// 		existingStudent.setId(id);
// 		existingStudent.setFirstName(student.getFirstName());
// 		existingStudent.setLastName(student.getLastName());
// 		existingStudent.setEmail(student.getEmail());		
// 		carOwnerServiceImpl.updateStudent(existingStudent);
// 		
// 		return "redirect:/students";
// 	}
// 	
// 	@GetMapping("/students/{id}")
// 	public String deleteStudent(@PathVariable Long id) {
// 		
// 		carOwnerServiceImpl.deleteStudentById(id);
// 		
// 		return "redirect:/students";
// 	}	
 }