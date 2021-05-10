package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.dao.ClasseRepository;
import com.example.dao.CompteRepository;
import com.example.dao.MatiereRepository;
import com.example.dao.UtilisateurRepository;
import com.example.entities.Admin;
import com.example.entities.Classe;
import com.example.entities.Compte;
import com.example.entities.Enseignant;
import com.example.entities.Etudiant;
import com.example.entities.Matiere;
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
	 
		public static void main(String[] args) {
		SpringApplication.run(CatSpringMvcApplication.class, args);

		}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	    ipRepository.save(new Enseignant ( "dorra", "ayari", "doura.ayari@gmail.com","soukra ariana",20484082,"en",123456));
	    ipRepository.save(new  Etudiant ("dorra", "ayari", "doura.ayari@gmail.com","soukra ariana",20484082,"et",123456));
	    ipRepository.save(new  Admin ("dorra", "ayari", "doura.ayari@gmail.com","soukra ariana",20484082,"ad",127477));
	    ipRepository.save(new Enseignant ( "dorra", "ayari", "doura.ayari@gmail.com","soukra ariana",20484082,"en",123456));
	    ipRepository.save(new  Etudiant ("dorra", "ayari", "doura.ayari@gmail.com","soukra ariana",20484082,"et",123456));
	    ipRepository.save(new  Admin ("dorra", "ayari", "doura.ayari@gmail.com","soukra ariana",20484082,"ad",127477));
	    ipRepository.save(new Enseignant ( "dorra", "ayari", "doura.ayari@gmail.com","soukra ariana",20484082,"en",123456));
	    ipRepository.save(new  Etudiant ("dorra", "ayari", "doura.ayari@gmail.com","soukra ariana",20484082,"et",123456));
	    ipRepository.save(new  Admin ("dorra", "ayari", "doura.ayari@gmail.com","soukra ariana",20484082,"ad",127477));
	    icRepository.save(new  Classe(0, "dsi22", null, null));
	    compRepository.save(new  Compte(0,null, "hghhy",12541,"hhdgj"));
	    matRepository.save(new  Matiere(0,"php",null, null));
	    matRepository.save(new  Matiere(0,"jee",null, null));

	}

}
