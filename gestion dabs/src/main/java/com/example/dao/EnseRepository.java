package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.entities.Enseigne;


public interface EnseRepository extends CrudRepository<Enseigne, Integer>,JpaRepository<Enseigne, Integer> {

}
