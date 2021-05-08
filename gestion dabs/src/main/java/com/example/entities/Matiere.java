package com.example.entities;

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
public class Matiere {
	 @Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_Matiere;
	private String Nom_Matiere;
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
	public String getNom_Matiere() {
		return Nom_Matiere;
	}
	public void setNom_Matiere(String nom_Matiere) {
		Nom_Matiere = nom_Matiere;
	}
	public Matiere() {
		super();
	}
	public Matiere(int id_Matiere, String nom_Matiere) {
		super();
		this.id_Matiere = id_Matiere;
		Nom_Matiere = nom_Matiere;
	} 
}
