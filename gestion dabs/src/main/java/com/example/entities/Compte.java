package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Compte { 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id_compte;
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "numCin")
	private Utilisateur utilisateur;
private String login_name;
private int password;
private String role;
public int getId_compte() {
	return id_compte;
}
public void setId_compte(int id_compte) {
	this.id_compte = id_compte;
}
public String getLogin_name() {
	return login_name;
}
public void setLogin_name(String login_name) {
	this.login_name = login_name;
}
public int getPassword() {
	return password;
}
public void setPassword(int password) {
	this.password = password;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public Compte() {
	super();
}
public Compte(int id_compte, Utilisateur utilisateur, String login_name, int password, String role) {
	super();
	this.id_compte = id_compte;
	this.utilisateur = utilisateur;
	this.login_name = login_name;
	this.password = password;
	this.role = role;
}

}
