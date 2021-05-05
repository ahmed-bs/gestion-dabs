package com.example.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="Classe")
public class Classe implements Serializable {
	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  @NotNull
private int id_class;
	
public Classe() {
	super();
}

public Classe(int id_class) {
	super();
	this.id_class = id_class;
}

public int getId_class() {
	return id_class;
}

public void setId_class(int id_class) {
	this.id_class = id_class;
}
}
