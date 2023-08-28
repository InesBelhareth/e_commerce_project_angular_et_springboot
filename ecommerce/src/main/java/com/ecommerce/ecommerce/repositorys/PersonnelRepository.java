package com.ecommerce.ecommerce.repositorys;

import com.ecommerce.ecommerce.models.Personnel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface PersonnelRepository extends JpaRepository<Personnel,Integer> {
    Optional<Personnel> findPersonnelByCin(String cin);


@Query(value= "SELECT * from personnel",nativeQuery = true)
List<Personnel> afficherpersonnel();

}
