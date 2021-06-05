package com.example.entities;

import java.io.Serializable;
import java.util.ArrayList;

import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;



@Entity
@DiscriminatorValue("en")
public class Enseignant extends Utilisateur implements Serializable  {

	public Enseignant(String nom, String prenom, String email, String adresse, int tel, String role, int numCnrps,
			List<Enseigne> enseigne) {
		super(nom, prenom, email, adresse, tel, role);
		this.numCnrps = numCnrps;
		this.enseigne = enseigne;
	}

private int numCnrps;
 @OneToMany(mappedBy="enseignant",fetch = FetchType.LAZY)
	private List<Enseigne> enseigne = new ArrayList<Enseigne>();
 

public Enseignant() {
	super();
}



/**
 * @param nom
 * @param prenom
 * @param email
 * @param adresse
 * @param tel
 * @param role
 */



public List<Enseigne> getEnseigne() {
	return enseigne;
}



public void setEnseigne(List<Enseigne> enseigne) {
	this.enseigne = enseigne;
}



public int getNumCnrps() {
	return numCnrps;
}

public void setNumCnrps(int numCnrps) {
	this.numCnrps = numCnrps;
}


}