package com.example.entities;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Absence {

	public Absence() {
		super();
	}

	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    int id_abs;

	  
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
	public int getId_abs() {
		return id_abs;
	}
	public void setId_abs(int id_abs) {
		this.id_abs = id_abs;
	}

	public Absence( Seance seance, Etudiant etudiant) {
		super();
		this.seance = seance;
		this.etudiant = etudiant;
	}
}
