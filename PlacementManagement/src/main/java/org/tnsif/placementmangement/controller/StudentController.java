package org.tnsif.placementmangement.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.tnsif.placementmangement.services.StudentService;
import org.tnsif.placementmangemententites.Student;

@RestController
public class StudentController  {

	 @Autowired
	 private StudentService service;
	 // REST full api for crude operation
	 @GetMapping("/students")
	 public List<Student>listAll()
	 {
		 return service.retriveAll();
	 }
	 @GetMapping("/student/{id}")
	 
	 public  ResponseEntity<Student>get(@PathVariable Integer id)
	 { 
		 try {
		 Student student=service.retrive(id);
		 return new ResponseEntity<Student>(student,HttpStatus.OK);
	 }
	 catch(NoSuchElementException e)
	 {
		 return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
	 }
		 
	 }
	 @DeleteMapping("/student/{id}")
	 public  void remove (@PathVariable Integer id)
	 {
		
		 service.delete(id);
	 }
	 // to insert
	 @PostMapping("/students")
	 public void insert (@RequestBody Student student)
	 {
		 service.add(student);
	 }
	 public ResponseEntity<?>update(@RequestBody Student student,@PathVariable Integer id)
	 {
		 try {
		 Student s1=service.retrive(id);
		 service.add(student);
		 return new ResponseEntity<>(HttpStatus.OK);
		 
		 }
		 catch (NoSuchElementException e)
		 {
			 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		 }
		 
	 }
}
