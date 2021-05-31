package com.example.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("et")
public class Etudiant  extends Utilisateur implements Serializable{
	private int abs=0;
	private int numIns;
	  @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name="code_classe")
	 private Classe classe;
	  
	  @ManyToMany(mappedBy="etudiant",fetch = FetchType.LAZY)
	  private List<Seance> seances = new ArrayList<Seance>();
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


	public int getAbs() {
		return abs;
	}


	public void setAbs(int abs) {
		this.abs = abs;
	}



	
}
