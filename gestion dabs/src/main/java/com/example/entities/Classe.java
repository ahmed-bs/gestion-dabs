package com.example.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@DiscriminatorValue("cl")
public class Classe implements Serializable {
	  @Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
	  @NotNull
private int id_class;
	public List<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

	public List<Enseigne> getEnseigne() {
		return enseigne;
	}

	public void setEnseigne(List<Enseigne> enseigne) {
		this.enseigne = enseigne;
	}

	private String name ;
	  @OneToMany(mappedBy="classe",fetch = FetchType.LAZY)
	private List<Etudiant> etudiants = new ArrayList<Etudiant>();
	
	  @OneToMany(mappedBy="classe",fetch = FetchType.LAZY)
		private List<Enseigne> enseigne = new ArrayList<Enseigne>();
	
public Classe() {
	super();
}

public Classe(String name) {
	super();

	this.name = name;
}


public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Classe(int id_class, String name, List<Etudiant> etudiants, List<Enseigne> enseigne) {
	super();
	this.id_class = id_class;
	this.name = name;
	this.etudiants = etudiants;
	this.enseigne = enseigne;
}

public int getId_class() {
	return id_class;
}

public void setId_class(int id_class) {
	this.id_class = id_class;
}
}
