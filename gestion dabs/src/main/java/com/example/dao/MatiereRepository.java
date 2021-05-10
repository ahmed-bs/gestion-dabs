package com.example.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Matiere;



@Repository("MatiereRepository")
public interface MatiereRepository extends CrudRepository<Matiere, Integer>,JpaRepository<Matiere, Integer> {


	


}
