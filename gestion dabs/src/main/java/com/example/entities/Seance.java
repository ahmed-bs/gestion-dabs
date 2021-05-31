package com.example.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;
@Entity
public class Seance {



@ManyToOne(fetch = FetchType.LAZY)	
@JoinColumn(name = "id_sc_ens")
private Enseigne enseigne;

@ManyToMany(fetch = FetchType.LAZY)
@JoinTable(name = "absence",joinColumns = @JoinColumn(name = "seance_id"), 
inverseJoinColumns = @JoinColumn(name = "etudiant_id"))
private List<Etudiant> etudiant = new ArrayList<Etudiant>();








@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id_sc;
private Date date;
private int heure;








@Autowired
public Seance(Enseigne enseigne, List<Etudiant> etudiant, Date date, int heure) {
	super();
	this.enseigne = enseigne;
	this.etudiant = etudiant;

	this.date = date;
	this.heure = heure;
}

public Seance() {
	// TODO Auto-generated constructor stub
}

public Seance(Date date2, int j) {
	// TODO Auto-generated constructor stub
}



public int getId_sc() {
	return id_sc;
}
public void setId_sc(int id_sc) {
	this.id_sc = id_sc;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public int getHeure() {
	return heure;
}
public void setHeure(int heure) {
	this.heure = heure;
}



}
