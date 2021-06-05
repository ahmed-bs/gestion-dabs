package com.example.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("et")
public class Etudiant  extends Utilisateur implements Serializable{

	private int numIns;
	  @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name="code_classe")
	 private Classe classe;
	  


	  @OneToMany(mappedBy="etudiant",fetch = FetchType.LAZY)
	private List<Absence> absence = new ArrayList<Absence>();
	  

	
	
	public Classe getClasse() {
		return classe;
	}



	public void setClasse(Classe classe) {
		this.classe = classe;
	}




	public int getNumIns() {
		return numIns;
	}

	public void setNumIns(int numIns) {
		this.numIns = numIns;
	}

	public Etudiant() {
		// TODO Auto-generated constructor stub
	}

	


	/**
		 * @param nom
		 * @param prenom
		 * @param email
		 * @param adresse
		 * @param tel
		 * @param role
		 * @param abs
		 * @param numIns
		 * @param classe
		 * @param seances
		 */
		public Etudiant(String nom, String prenom, String email, String adresse, int tel, String role,
				int numIns, Classe classe) {
			super(nom, prenom, email, adresse, tel, role);
			this.numIns = numIns;
			this.classe = classe;
		
		}







	
}
