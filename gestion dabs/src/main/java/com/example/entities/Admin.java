package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="Admin")
public class Admin extends Utilisateur {

 private int numCnrps;

	public int getNumCnrps() {
		return numCnrps;
	}

	public void setNumCnrps(int numCnrps) {
		this.numCnrps = numCnrps;
	}

	public Admin(String nom, String prenom,String email, String adresse, int tel,int numCnrps) {
		super( nom, prenom,email, adresse,tel);
		this.numCnrps = numCnrps;
	}

	public Admin() {
		super();
	}
}
