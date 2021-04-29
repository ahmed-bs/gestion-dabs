package com.example.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Utilisateur;


@Repository("UtilisateurRepository")
public interface UtilisateurRepository extends CrudRepository<Utilisateur, Integer>,JpaRepository<Utilisateur, Integer> {


	


}
