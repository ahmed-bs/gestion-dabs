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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@DiscriminatorValue("ma")
public class Matiere implements Serializable{
	 @Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_Matiere;
	 private String name;
    @ManyToOne
	@JoinColumn(name="code_enseignant")
  private Enseignant enseignant;
    @ManyToMany
	  private List<Etudiant> etudiants = new ArrayList<Etudiant>();
    
	public int getId_Matiere() {
		return id_Matiere;
	}
	public void setId_Matiere(int id_Matiere) {
		this.id_Matiere = id_Matiere;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Matiere() {
		super();
	}
	
	public Matiere(int id_Matiere, String name) {
		super();
		this.id_Matiere = id_Matiere;
		this.name = name;
	}
	public Matiere(int id_Matiere, String name, Enseignant enseignant, List<Etudiant> etudiants) {
		super();
		this.id_Matiere = id_Matiere;
		this.name = name;
		this.enseignant = enseignant;
		this.etudiants = etudiants;
	}

	
}
