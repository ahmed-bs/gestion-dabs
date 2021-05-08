package com.example.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("et")
public class Etudiant  extends Utilisateur implements Serializable{
	private boolean abs;
	private int numIns;
	  @ManyToOne
	 @JoinColumn(name="code_classe")
	 private Classe classe;
	  @ManyToMany
	  private List<Matiere> matieres = new ArrayList<Matiere>();
		public Etudiant() {
			super();
		}
	

	public Etudiant( String nom, String prenom,String email, String adresse, int tel,String role,int numIns) {
		super(  nom, prenom,email, adresse,tel,role);
		this.numIns = numIns;
	}

	public int getNumIns() {
		return numIns;
	}

	public void setNumIns(int numIns) {
		this.numIns = numIns;
	}


	public boolean getAbs() {
		return abs;
	}


	public void setAbs(boolean abs) {
		this.abs = abs;
	}
	
}
