package com.example.web;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.websocket.server.PathParam;
import org.springframework.data.repository.CrudRepository;

import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Validate;
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
import com.example.entities.Utilisateur;

@Controller
public class CatController {
	
	@Autowired 
 UtilisateurRepository utilisateurRepository;
		
	@RequestMapping(value = "/index" )	
	public String test(Model model){
		return "index";
	}
	
	@RequestMapping(value = "/Utilisateur" )
	public String tester(Model model){
	
		List<Utilisateur> Utilisateurss = utilisateurRepository.findAll();
		model.addAttribute("listeUtilisateurs",Utilisateurss);
	return "VueProduits";
	}

	
	@RequestMapping(value="/delete/{id}",method = RequestMethod.GET)    
    public String delete(@PathVariable int id){    
		utilisateurRepository.deleteById(id);    
        return "redirect:/Utilisateur";    
    }   
	


	
	@RequestMapping(value = "/utilisateurform",method = RequestMethod.GET )
	public String form(Model model){
		model.addAttribute("listeUtilisateurs",new Utilisateur());
	return "VueUpdate";
	}

	

	@RequestMapping(value = "edit",method = RequestMethod.GET )
	public String edit(Model model,int numCin){
		Optional<Utilisateur> p=utilisateurRepository.findById(numCin);
		 if(p.isPresent()) {//vérifie si p est null ou non. Si il n'est pas null, je créer un objet Produit que j'initialise avec p et que j'envois par la suite dans le formulaire via model.
			 Utilisateur utilisateur = p.get();
			  model.addAttribute("listeUtilisateurs",utilisateur);
			  }
	return "VueUpdate";
	}
	

	@RequestMapping(value="/save",method = RequestMethod.POST)    
    public String save(Model model, Utilisateur utilisateur){    
		utilisateurRepository.save(utilisateur);
        return "redirect:/Utilisateur";    
    }   
	
	
	
	
	
	
	
	
	
}

