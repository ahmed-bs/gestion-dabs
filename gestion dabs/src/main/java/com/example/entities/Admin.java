package com.example.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@DiscriminatorValue("ad")
public class Admin extends Utilisateur implements Serializable{

 private int numCnrps;

	public int getNumCnrps() {
		return numCnrps;
	}

	public void setNumCnrps(int numCnrps) {
		this.numCnrps = numCnrps;
	}

	public Admin(String nom, String prenom,String email, String adresse, int tel,String role,int numCnrps) {
		super( nom, prenom,email, adresse,tel,role);
		this.numCnrps = numCnrps;
	}

	public Admin() {
		super();
	}
}
