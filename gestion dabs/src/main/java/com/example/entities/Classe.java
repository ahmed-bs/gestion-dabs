package com.example.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
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
	  //0
	  @OneToMany
	private List<Etudiant> etudiants = new ArrayList<Etudiant>();
		
	  @ManyToMany
	  @JoinColumn(name="code_enseignant")
	  private List<Enseignant> enseignants = new ArrayList<Enseignant>();
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
