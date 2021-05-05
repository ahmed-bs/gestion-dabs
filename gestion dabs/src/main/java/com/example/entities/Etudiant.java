package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Etudiant")
public class Etudiant  extends Utilisateur {

	private int numIns;

	public Etudiant() {
		super();
	}

	public Etudiant( String nom, String prenom,String email, String adresse, int tel,int numIns) {
		super(  nom, prenom,email, adresse,tel);
		this.numIns = numIns;
	}

	public int getNumIns() {
		return numIns;
	}

	public void setNumIns(int numIns) {
		this.numIns = numIns;
	}
	
}
