package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Retard {

	

	
	public Retard() {
		super();
	}
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    int id_ret;

	  
	  @ManyToOne(fetch = FetchType.LAZY)	
	  @JoinColumn(name = "Seance_key")
	  private  Seance seance;
	  
	  @ManyToOne(fetch = FetchType.LAZY)
	  @JoinColumn(name="etudiants_keys")
	  private Etudiant etudiant;
		  
	  
	public Seance getSeance() {
		return seance;
	}
	public void setSeance(Seance seance) {
		this.seance = seance;
	}
	public Etudiant getEtudiant() {
		return etudiant;
	}
	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}
	public int getId_ret() {
		return id_ret;
	}
	public void setId_ret(int id_ret) {
		this.id_ret = id_ret;
	}
	
	public Retard( Seance seance, Etudiant etudiant) {
		super();
		this.seance = seance;
		this.etudiant = etudiant;
	}
}

