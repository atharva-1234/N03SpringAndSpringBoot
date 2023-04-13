package org.tnsif.placementmangement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tnsif.placementmangemententites.Student;

public interface Studentrepository  extends JpaRepository<Student,Integer>{

}
