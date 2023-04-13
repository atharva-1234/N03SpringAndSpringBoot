package org.tnsif.placementmangement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.placementmangement.repository.PlacementRepository;
import org.tnsif.placementmangement.repository.Studentrepository;
import org.tnsif.placementmangemententites.Placement;
import org.tnsif.placementmangemententites.Student;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PlacementService {
	
	@Autowired
	private PlacementRepository repo1;
	
	public  void add(Placement placement)
	 {
		 repo1.save(placement);
	 }
	public Placement retrive(Integer id)
	{
		return repo1.findById(id).get();
	}
	public List<Placement>retriveAll()
	{
		return repo1.findAll();
	}

}
