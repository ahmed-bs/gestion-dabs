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
  
	public int getId_ens() {
		return id_ens;
	}

	public void setId_ens(int id_ens) {
		this.id_ens = id_ens;
	}

	public List<Seance> getSeance() {
		return seance;
	}

	public void setSeance(List<Seance> seance) {
		this.seance = seance;
	}

	public Matiere getMatiere() {
		return matiere;
	}

	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}

	public Enseignant getEnseignant() {
		return enseignant;
	}

	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}

	public Classe getClasse() {
		return classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}

	@OneToMany(mappedBy="enseigne",fetch = FetchType.LAZY)	
	  private List<Seance> seance = new ArrayList<Seance>();
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_Matiere")
	private Matiere matiere;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="numCin_enseignant")
	private Enseignant enseignant;
	
	/**
	 * 
	 */
	public Enseigne() {
		super();
	}

	/**
	 * @param id_ens
	 * @param seance
	 * @param matiere
	 * @param enseignant
	 * @param classe
	 */
	public Enseigne( List<Seance> seance, Matiere matiere, Enseignant enseignant, Classe classe) {
		super();
		this.seance = seance;
		this.matiere = matiere;
		this.enseignant = enseignant;
		this.classe = classe;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="enseigne")
	private Classe classe;
}
