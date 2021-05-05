package com.example.entities;

import java.io.Serializable;
import java.util.ArrayList;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;



@Entity
@DiscriminatorValue("en")
public class Enseignant extends Utilisateur implements Serializable  {
private int numCnrps;
 @OneToMany
	private List<Matiere> matiere = new ArrayList<Matiere>();
 @ManyToMany
 @JoinColumn(name="code_classe")
 private List<Classe> Classes = new ArrayList<Classe>();
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