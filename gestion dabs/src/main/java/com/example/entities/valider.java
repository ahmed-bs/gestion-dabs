package com.example.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
@Entity
public class valider {
	@Id
private int id;
private Date date_heure;
@ManyToMany
private List<Etudiant> etudiants = new ArrayList<Etudiant>();
@JoinColumn(name="code_etudiant")
@ManyToMany
private List<Matiere> matieres = new ArrayList<Matiere>();
@JoinColumn(name="code_matiere")
public boolean valider() {
	return true;
}
}
