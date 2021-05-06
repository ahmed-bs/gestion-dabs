package com.example.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("et")
public class Etudiant  extends Utilisateur implements Serializable{

	private int numIns;
	  @ManyToOne
	 @JoinColumn(name="code_classe")
	 private Classe classe;
		
		public Etudiant() {
			super();
		}
	

	public Etudiant( String nom, String prenom,String email, String adresse, int tel,String role,int numIns) {
		super(  nom, prenom,email, adresse,tel,role);
		this.numIns = numIns;
	}

	public int getNumIns() {
		return numIns;
	}

	public void setNumIns(int numIns) {
		this.numIns = numIns;
	}
	
}
