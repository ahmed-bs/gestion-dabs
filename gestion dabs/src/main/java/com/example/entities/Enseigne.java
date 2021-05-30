package com.example.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Enseigne {
	@Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_ens;
    @ManyToMany(fetch = FetchType.LAZY)
	  private List<Etudiant> etudiants = new ArrayList<Etudiant>();
	@OneToMany(mappedBy="enseigne", cascade = CascadeType.ALL)	
	  private List<Seance> seance = new ArrayList<Seance>();
	
	 @JoinColumn
	 private Classe classe;
	
	 @JoinColumn
	 private Enseignant enseignant;

	 @JoinColumn
	 private Matiere matiere;
	
	

}
