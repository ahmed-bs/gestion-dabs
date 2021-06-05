package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import com.example.entities.Absence;

public interface AbsenceRepository  extends CrudRepository<Absence, Integer>,JpaRepository<Absence, Integer>{



}
