package com.example;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.dao.ClasseRepository;
import com.example.dao.CompteRepository;
import com.example.dao.EnseRepository;
import com.example.dao.MatiereRepository;
import com.example.dao.SeanceRepository;
import com.example.dao.UtilisateurRepository;
import com.example.entities.Admin;
import com.example.entities.Classe;
import com.example.entities.Compte;
import com.example.entities.Enseignant;
import com.example.entities.Enseigne;
import com.example.entities.Etudiant;
import com.example.entities.Matiere;
import com.example.entities.Seance;
import com.example.entities.Utilisateur;

@SpringBootApplication
@ComponentScan
public class CatSpringMvcApplication implements CommandLineRunner{
	
	
	 @Autowired
		 UtilisateurRepository ipRepository;
	 @Autowired
	  ClasseRepository icRepository;
	 @Autowired
	  CompteRepository compRepository;
	 @Autowired
	  MatiereRepository matRepository;
	 @Autowired
	  SeanceRepository seanRepository;
	 @Autowired
	 EnseRepository enseRepository;
		public static void main(String[] args) {
		SpringApplication.run(CatSpringMvcApplication.class, args);

		}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Date date = new Date();
		SimpleDateFormat dateFormat =new SimpleDateFormat("MM/DD/YY");
	    
	    
	  //  int id_ens, List<Seance> seance, Matiere matiere, Enseignant enseignant, Classe classe
	    List<Enseigne> enseigne=new ArrayList<Enseigne>();
	    List<Seance> seance=new ArrayList<Seance>();
	    List<Etudiant> etudiants=new ArrayList<Etudiant>();
	    //admin
	    Admin ad1=new  Admin ("dorra", "ayari", "doura.ayari@gmail.com","soukra ariana",20484082,"ad",127477);
	    Admin ad2=new  Admin ("dorra", "ayari", "doura.ayari@gmail.com","soukra ariana",20484082,"ad",127477);
	    Admin ad3=new  Admin ("dorra", "ayari", "doura.ayari@gmail.com","soukra ariana",20484082,"ad",127477);
	 
	    //enseignant
	    Enseignant en1=new Enseignant ( "dorra", "ayari", "doura.ayari@gmail.com","soukra ariana",20484082,"en",123456,enseigne);
	    Enseignant en2=new Enseignant ( "dorra", "ayari", "doura.ayari@gmail.com","soukra ariana",20484082,"en",123456,enseigne);
	    Enseignant en3=new Enseignant ( "dorra", "ayari", "doura.ayari@gmail.com","soukra ariana",20484082,"en",123456,enseigne);
	  
	    //class
	    Classe c1=new  Classe(0, "dsi22", etudiants, enseigne);
	    Classe c2=new  Classe(2, "dsi21", etudiants, enseigne);
	    Classe c3=new  Classe(3, "sys22", etudiants, enseigne);
	    Classe c4=new  Classe(1, "dsi32", etudiants, enseigne);	
	 
	  //etudiant
	    Etudiant et1 =new  Etudiant ("dorra", "ayari", "doura.ayari@gmail.com","soukra ariana",20484082,"et",2,c1,seance);
	    Etudiant et2 =new  Etudiant ("dorra", "ayari", "doura.ayari@gmail.com","soukra ariana",20484082,"et",2,c2,seance);
	    Etudiant et3 =new  Etudiant ("dorra", "ayari", "doura.ayari@gmail.com","soukra ariana",20484082,"et",2,c3,seance);
	 
	    //matiere
	    Matiere m=new  Matiere(0,"php",enseigne);
	    Matiere m1=new  Matiere(1,"math",enseigne);
	    Matiere m2=new  Matiere(2,"poo",enseigne);
	    Matiere m3=new  Matiere(3,"jee",enseigne);
	  
	    
	    //enseigne
	    Enseigne es1=new Enseigne(seance,m,en1,c1);
	    Enseigne es2=new Enseigne(seance,m2,en2,c2);
	    Enseigne es3=new Enseigne(seance,m1,en3,c3);
	    Enseigne es4=new Enseigne(seance,m3,en1,c1);
	    enseigne.add(es1);
	    enseigne.add(es2);
	    enseigne.add(es3);
	    enseigne.add(es4);
	  
	    //seance
	    Seance s1=new Seance(es1,etudiants,dateFormat.format(date).toString(),2);
	    Seance s2=new Seance(es3,etudiants,dateFormat.format(date).toString(),2);
	    Seance s3=new Seance(es4,etudiants,dateFormat.format(date).toString(),2); 
	    seance.add(s1);
	    seance.add(s2);
	    seance.add(s3);
	 

	  //compte
	    Compte cp1=new  Compte(0,ad1, "hghhy",12541,"hhdgj");
	   
	    /****************************************/
	    ipRepository.save(ad1);
	    ipRepository.save(ad2);
	    ipRepository.save(ad3);
	    
	    ipRepository.save(en1);
	    ipRepository.save(en2);
	    ipRepository.save(en3);
	    
	    icRepository.save(c1);
	    icRepository.save(c2);
	    icRepository.save(c3);
	    icRepository.save(c4);
	    
	    ipRepository.save(et1);
	    ipRepository.save(et2);
	    ipRepository.save(et3);
	    
	    matRepository.save(m);
	    matRepository.save(m1);
	    matRepository.save(m2);
	    matRepository.save(m3);
	    
	    enseRepository.save(es1);
	    enseRepository.save(es2);
	    enseRepository.save(es3);
	    enseRepository.save(es4);
	    
	    seanRepository.save(s1);
	    seanRepository.save(s2);
	    seanRepository.save(s3);
	    
	    compRepository.save(cp1);
	    
	}

}
