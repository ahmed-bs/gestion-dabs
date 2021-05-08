package com.example.web;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.websocket.server.PathParam;
import org.springframework.data.repository.CrudRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.BindingResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.dao.UtilisateurRepository;
import com.example.entities.Admin;
import com.example.entities.Enseignant;
import com.example.entities.Etudiant;
import com.example.entities.Utilisateur;

@Controller
public class CatController {
	
	@Autowired 
 UtilisateurRepository utilisateurRepository;
		//*********************index controller*********************/
	@RequestMapping(value = "/index" )	
	public String test(Model model){
		return "index";
	}
	
	//*****************************affiche ************************************/
	@RequestMapping(value = "/Etudiant" )
	public String tester(Model model){
		List<Utilisateur> Utilisateurss = utilisateurRepository.findAll();
		model.addAttribute("listeUtilisateurs",Utilisateurss);
	return "VueEtudiant";
	}

	@RequestMapping(value = "/Enseignant" )
	public String teste0(Model model){
		List<Utilisateur> Utilisateurss = utilisateurRepository.findAll();
		model.addAttribute("listeUtilisateurs",Utilisateurss);
	return "VueEnseignant";
	}
	@RequestMapping(value = "/Admin" )
	public String tester2(Model model){
		List<Utilisateur> Utilisateurss = utilisateurRepository.findAll();
		model.addAttribute("listeUtilisateurs",Utilisateurss);
	return "VueAdmin";
	}
	/***************************ajouter********************************/
	@RequestMapping(value = "/ajouterEn",method = RequestMethod.GET )
	public String form2(Model model){
		model.addAttribute("listeUtilisateurs",new Enseignant());
	return "ajouterEnseignant";
	}
	
	@RequestMapping(value = "/VueUpdate",method = RequestMethod.GET )
	public String form3(Model model){
		model.addAttribute("listeUtilisateurs",new Etudiant());
	return "VueUpdate";
	}
	
	@RequestMapping(value = "/ajouterAd",method = RequestMethod.GET )
	public String form(Model model){
		model.addAttribute("listeUtilisateurs",new Admin());
	return "ajouterAdmin";
	}
	
	
	
/*************************************ediiiit****************************************/
	
	
	@RequestMapping(value = "edit",method = RequestMethod.GET )
	public String edit(Model model,int numCin){
		Optional<Utilisateur> p=utilisateurRepository.findById(numCin);
		 if(p.isPresent()) {
			 //vérifie si p est null ou non. Si il n'est pas null, je créer un objet Produit que j'initialise avec p et que j'envois par la suite dans le formulaire via model.
			 Etudiant utilisateur = (Etudiant) p.get();
			  model.addAttribute("listeUtilisateurs",utilisateur);
			  }
	return "VueUpdate";
	}
	@RequestMapping(value = "editEn",method = RequestMethod.GET )
	public String editEn(Model model,int numCin){
		Optional<Utilisateur> p=utilisateurRepository.findById(numCin);
		 if(p.isPresent()) {
			 //vérifie si p est null ou non. Si il n'est pas null, je créer un objet Produit que j'initialise avec p et que j'envois par la suite dans le formulaire via model.
			 Enseignant utilisateur = (Enseignant) p.get();
			  model.addAttribute("listeUtilisateurs",utilisateur);
			  }
	return "ajouterEnseignant";
	}
	
	@RequestMapping(value = "editAd",method = RequestMethod.GET )
	public String editAd(Model model,int numCin){
		Optional<Utilisateur> p=utilisateurRepository.findById(numCin);
		 if(p.isPresent()) {
			 //vérifie si p est null ou non. Si il n'est pas null, je créer un objet Produit que j'initialise avec p et que j'envois par la suite dans le formulaire via model.
			 Admin utilisateur = (Admin) p.get();
			  model.addAttribute("listeUtilisateurs",utilisateur);
			  }
	return "ajouterAdmin";
	}
/********************************save***********************************/
	@RequestMapping(value="/save",method = RequestMethod.POST)    
    public String save(Model model, Etudiant utilisateur){    
		utilisateurRepository.save(utilisateur);
        return "redirect:/Etudiant";    
    }   
	
	@RequestMapping(value="/saveEn",method = RequestMethod.POST)    
    public String saveEn(Model model, Enseignant utilisateur){    
		utilisateurRepository.save(utilisateur);
        return "redirect:/Enseignant";    
    } 
	@RequestMapping(value="/saveAd",method = RequestMethod.POST)    
    public String saveAd(Model model, Enseignant utilisateur){    
		utilisateurRepository.save(utilisateur);
        return "redirect:/Admin";    
    } 
	
	
	
	
	//************************delete for all*****************************/

	@RequestMapping(value="/delete/{id}",method = RequestMethod.GET)    
    public String delete(@PathVariable int id){    
		utilisateurRepository.deleteById(id);    
        return "redirect:/index";    
    }   
	



	
	
}

