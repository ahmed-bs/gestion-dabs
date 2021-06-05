package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.entities.Retard;

public interface RetardRepository  extends CrudRepository<Retard, Integer>,JpaRepository<Retard, Integer>{

}
