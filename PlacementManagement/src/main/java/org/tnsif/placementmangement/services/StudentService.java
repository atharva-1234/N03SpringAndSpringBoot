package org.tnsif.placementmangement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.placementmangement.repository.Studentrepository;
import org.tnsif.placementmangemententites.Student;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class StudentService {
           
	@Autowired
	 private Studentrepository repo;
	 
	public  void add(Student student)
	 {
		 repo.save(student);
	 }
	 //
	public  Student retrive(Integer id)
	 {
		return repo.findById(id).get();
	 }
	// delete 
	public  void delete(Integer id)
	 {
		 repo.deleteById(id);
	 }
	public  List<Student> retriveAll()
	 {
		 return repo.findAll();
	 }
}
