package com.example.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Etudiant")
@DiscriminatorValue("et")
public class Etudiant  extends Utilisateur implements Serializable{

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
