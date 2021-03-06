package com.example;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
	    //admin
	    Admin ad1=new  Admin ("dorra", "ayari", "doura.ayari@gmail.com","soukra ariana",20484082,"ad",127477);
	    Admin ad2=new  Admin ("dorra", "ayari", "doura.ayari@gmail.com","soukra ariana",20484082,"ad",127477);
	    Admin ad3=new  Admin ("dorra", "ayari", "doura.ayari@gmail.com","soukra ariana",20484082,"ad",127477);
	 
	    //enseignant
	    Enseignant en1=new Enseignant ( "dorra", "ayari", "doura.ayari@gmail.com","soukra ariana",20484082,"en",123456,enseigne);
	    Enseignant en2=new Enseignant ( "dorra", "ayari", "doura.ayari@gmail.com","soukra ariana",20484082,"en",123456,enseigne);
	    Enseignant en3=new Enseignant ( "dorra", "ayari", "doura.ayari@gmail.com","soukra ariana",20484082,"en",123456,enseigne);
	  
	    //class
	    Classe c1=new  Classe(1, "dsi22", enseigne);
	    Classe c2=new  Classe(2, "dsi21", enseigne);
	    Classe c3=new  Classe(3, "sys22", enseigne);
	    Classe c4=new  Classe(4, "dsi32", enseigne);	
	 
	  //etudiant
	    Etudiant et1 =new  Etudiant ("dorra", "ayari", "doura.ayari@gmail.com","soukra ariana",20484082,"et",2,c1);
	    Etudiant et2 =new  Etudiant ("dorra", "ayari", "doura.ayari@gmail.com","soukra ariana",20484082,"et",2,c2);
	    Etudiant et3 =new  Etudiant ("dorra", "ayari", "doura.ayari@gmail.com","soukra ariana",20484082,"et",2,c3);
	 
	    //matiere
	    Matiere m=new  Matiere(1,"php",enseigne);
	    Matiere m1=new  Matiere(2,"math",enseigne);
	    Matiere m2=new  Matiere(3,"poo",enseigne);
	    Matiere m3=new  Matiere(4,"jee",enseigne);
	  
	    
	    //enseigne
	    Enseigne es1=new Enseigne(m,en1,c1);
	    Enseigne es2=new Enseigne(m2,en2,c2);
	    Enseigne es3=new Enseigne(m1,en3,c3);
	    Enseigne es4=new Enseigne(m3,en1,c1);
	    enseigne.add(es1);
	    enseigne.add(es2);
	    enseigne.add(es3);
	    enseigne.add(es4);
	  
	    //seance
	    Seance s1=new Seance(es1,dateFormat.format(date).toString(),10);
	    Seance s2=new Seance(es3,dateFormat.format(date).toString(),8);
	    Seance s3=new Seance(es4,dateFormat.format(date).toString(),12); 
	 

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
