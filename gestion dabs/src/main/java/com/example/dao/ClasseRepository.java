package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Classe;

@Repository("ClasseRepository")
public interface ClasseRepository extends CrudRepository<Classe, Integer>,JpaRepository<Classe, Integer>{

}
