package com.example.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
@DiscriminatorValue("ma")
public class Matiere implements Serializable{
	 @Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_Matiere;
	 private String name;
 
	 
	 
	 
		@OneToMany(mappedBy="matiere",fetch = FetchType.LAZY)	
		  private List<Enseigne> enseigne = new ArrayList<Enseigne>();
		 
	 
	 
	 
	 
    
	public int getId_Matiere() {
		return id_Matiere;
	}
	public void setId_Matiere(int id_Matiere) {
		this.id_Matiere = id_Matiere;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Matiere() {
		super();
	}
	
	public Matiere(int id_Matiere, String name) {
		super();
		this.id_Matiere = id_Matiere;
		this.name = name;
	}
	public Matiere(int id_Matiere, String name, List<Enseigne> enseigne) {
		super();
		this.id_Matiere = id_Matiere;
		this.name = name;
		this.enseigne = enseigne;

	}

	
}
