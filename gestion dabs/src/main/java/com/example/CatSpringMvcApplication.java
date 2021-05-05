package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.dao.UtilisateurRepository;
import com.example.entities.Admin;
import com.example.entities.Enseignant;
import com.example.entities.Etudiant;
import com.example.entities.Utilisateur;

@SpringBootApplication
@ComponentScan
public class CatSpringMvcApplication implements CommandLineRunner{
	
	
	 @Autowired
		 UtilisateurRepository ipRepository;
	 
	 
		public static void main(String[] args) {
		SpringApplication.run(CatSpringMvcApplication.class, args);

		}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
		 ipRepository.save(new Utilisateur( "dorra", "ayari", "doura.ayari@gmail.com","soukra ariana",20484082));	
		 ipRepository.save(new Utilisateur("dorra", "ayari", "doura.ayari@gmail.com","soukra ariana",20484082));	
	    ipRepository.save(new Utilisateur("dorra", "ayari", "doura.ayari@gmail.com","soukra ariana",20484082));	
	    ipRepository.save(new Utilisateur( "dorra", "ayari", "doura.ayari@gmail.com","soukra ariana",20484082));
	    ipRepository.save(new Enseignant ( "dorra", "ayari", "doura.ayari@gmail.com","soukra ariana",20484082,123456));
	    ipRepository.save(new  Etudiant ("dorra", "ayari", "doura.ayari@gmail.com","soukra ariana",20484082,123456));
	    ipRepository.save(new  Admin ("dorra", "ayari", "doura.ayari@gmail.com","soukra ariana",20484082,127477));
	}

}
