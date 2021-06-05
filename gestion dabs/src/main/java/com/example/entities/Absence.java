package com.example.entities;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Absence {
	@Id
    int id_abs;

	  
	  @ManyToOne(fetch = FetchType.LAZY)	
	  @JoinColumn(name = "absence_key")
	  private  Seance seance;
	  
	  @ManyToOne(fetch = FetchType.LAZY)
	  @JoinColumn(name="etudiants_keys")
	  private Etudiant etudiant;
		  
	  
	public int getId_abs() {
		return id_abs;
	}
	public void setId_abs(int id_abs) {
		this.id_abs = id_abs;
	}

	
}
