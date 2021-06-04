package com.example.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.sun.istack.NotNull;


@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type",discriminatorType=DiscriminatorType.STRING)
public abstract class Utilisateur implements Serializable{

	  public Compte getCompte() {
		return compte;
	}
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	@Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
	  @NotNull
private int numCin;
	  
	  @ManyToOne(fetch = FetchType.LAZY)
		 @JoinColumn(name="code_Compte")
		 private Compte compte;
			
	
	
private String nom;
private String prenom;
private String email;
private String adresse;
private int tel;
private String role;
public Utilisateur() {
	super();
}
public Utilisateur( String nom, String prenom,String email, String adresse, int tel,String role) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.email=email;
	this.adresse = adresse;
	this.tel = tel;
	this.role=role;
}
public int getNumCin() {
	return numCin;
}
public void setNumCin(int numCin) {
	this.numCin = numCin;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public int getTel() {
	return tel;
}
public void setTel(int tel) {
	this.tel = tel;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}


}
