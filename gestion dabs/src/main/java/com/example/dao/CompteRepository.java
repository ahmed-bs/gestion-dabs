package com.example.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Compte;
import com.example.entities.Utilisateur;


@Repository("CompteRepository")
public interface CompteRepository extends CrudRepository<Compte, Integer>,JpaRepository<Compte, Integer> {


	


}
