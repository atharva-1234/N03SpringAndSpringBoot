package org.tnsif.placementmangement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tnsif.placementmangemententites.Placement;
import org.tnsif.placementmangemententites.Student;

public interface PlacementRepository extends JpaRepository<Placement,Integer> {

}
