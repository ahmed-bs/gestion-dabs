package com.example.entities;


import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import org.springframework.beans.factory.annotation.Autowired;


@Entity
public class Seance {



@ManyToOne(fetch = FetchType.LAZY)	
@JoinColumn(name = "id_sc_ens")
private Enseigne enseigne;

@OneToMany(mappedBy="seance",fetch = FetchType.LAZY)
private List<Absence>  absence= new ArrayList<Absence>();



@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id_sc;
private String date;
private int heure;


public Seance() {
	// TODO Auto-generated constructor stub
}



@Autowired
public Seance(Enseigne enseigne, String string, int heure) {
	super();
	this.enseigne = enseigne;
	this.date = string;
	this.heure = heure;
}





public Enseigne getEnseigne() {
	return enseigne;
}

public void setEnseigne(Enseigne enseigne) {
	this.enseigne = enseigne;
}
public int getId_sc() {
	return id_sc;
}
public void setId_sc(int id_sc) {
	this.id_sc = id_sc;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public int getHeure() {
	return heure;
}
public void setHeure(int heure) {
	this.heure = heure;
}



}
