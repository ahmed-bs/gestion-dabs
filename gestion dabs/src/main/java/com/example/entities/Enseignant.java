package com.example.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@DiscriminatorValue("en")
public class Enseignant extends Utilisateur implements Serializable  {


 private int numCnrps;

public Enseignant() {
	super();
}
public Enseignant( String nom, String prenom,String email, String adresse, int tel,int numCnrps) {
	super(  nom, prenom,email, adresse,tel);
	this.numCnrps = numCnrps;
}



public int getNumCnrps() {
	return numCnrps;
}

public void setNumCnrps(int numCnrps) {
	this.numCnrps = numCnrps;
}


}
