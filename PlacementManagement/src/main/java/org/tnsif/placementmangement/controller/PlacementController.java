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
import org.tnsif.placementmangement.services.PlacementService;
import org.tnsif.placementmangemententites.Placement;
import org.tnsif.placementmangemententites.Student;

@RestController
public class PlacementController {

	@Autowired
	private PlacementService service;
	// rest api for crude
	public List<Placement>listAll()
	{
		return service.retriveAll();
	}
	@GetMapping("/placement/{id}")
	public ResponseEntity<Placement>get(@PathVariable Integer id)
	{
		try {
			Placement placement=service.retrive(id);
			return new ResponseEntity<Placement>(placement,HttpStatus.OK);
		}
		catch (NoSuchElementException e){
			return new ResponseEntity<Placement>(HttpStatus.NOT_FOUND);
		}
	}
		 /*@DeleteMapping("/placement/{id}")
		 public  void remove (@PathVariable Integer id)
		 {
			  service.delete(id);
		 }*/
		 // to insert
		 @PostMapping("/placement")
		 public void insert (@RequestBody Placement placement)
		 {
			 service.add(placement);
		 }
		 public ResponseEntity<?>update(@RequestBody Placement placement ,@PathVariable Integer id)
		 {
			 try {
				 Placement p1=service.retrive(id);
				 service.add(placement);
				 return new ResponseEntity<>(HttpStatus.OK);
			 }
			 catch (NoSuchElementException e)
			 {
				 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			 }
			 
	}
}
