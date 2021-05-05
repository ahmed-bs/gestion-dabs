package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="Matiere")
public class Matiere {
	 @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  @NotNull
	private int id_Matiere;
	private String Nom_Matiere;
	
	
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
