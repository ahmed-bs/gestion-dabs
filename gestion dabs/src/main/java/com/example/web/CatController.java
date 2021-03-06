package com.example.web;


import java.util.List;
import java.util.Optional;
import com.example.entities.Etudiant;
import com.example.entities.Matiere;
import com.example.entities.Retard;
import com.example.entities.Seance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.dao.AbsenceRepository;
import com.example.dao.ClasseRepository;
import com.example.dao.CompteRepository;
import com.example.dao.EnseRepository;
import com.example.dao.MatiereRepository;
import com.example.dao.RetardRepository;
import com.example.dao.SeanceRepository;
import com.example.dao.UtilisateurRepository;
import com.example.entities.Absence;
import com.example.entities.Admin;
import com.example.entities.Classe;
import com.example.entities.Compte;
import com.example.entities.Enseignant;
import com.example.entities.Enseigne;
import com.example.entities.Utilisateur;

@Controller
public class CatController {

	@Autowired 
 UtilisateurRepository utilisateurRepository;
	@Autowired 
	ClasseRepository classeRepository;
	@Autowired 
	CompteRepository compteRepository;
	@Autowired 
	MatiereRepository matiereRepository;
	@Autowired 
	SeanceRepository seanceRepository;
	@Autowired 
	EnseRepository enseRepository;
	@Autowired
	AbsenceRepository absenceRepository;
	@Autowired
	RetardRepository retardRepository;
	static public Seance id_s;
	static public int id_class4keys;
	static public int id_s5;
	static public String role;
		//*********************index controller*********************/
	@RequestMapping(value = "/index" )	
	public String test(Model model){
		role ="ad";
		return "index";
	}
	@RequestMapping(value = "/home" )	
	public String tesst(Model model){

		return "home";
	}
	@RequestMapping(value = "/utilisateurlist" )	
	public String test2(Model model){

		return "utilisateurlist";
	}
	@RequestMapping(value = "/pagehomeensg" )	
	public String test252(Model model){
role ="en";
		return "pagehomeensg";
	}
	@RequestMapping(value = "/pagehomeetut" )	
	public String test25742(Model model){
		role ="et";
		return "pagehomeetut";
	}
	
	//*****************************affiche ************************************/
	@RequestMapping(value = "/Etudiant" )
	public String tester(Model model){
		List<Utilisateur> Utilisateurss = utilisateurRepository.findAll();
		model.addAttribute("listeUtilisateurs",Utilisateurss);
		model.addAttribute("ifadmin",role);
	return "VueEtudiant";
	}

	@RequestMapping(value = "/Enseignant" )
	public String teste0(Model model){
		List<Utilisateur> Utilisateurss = utilisateurRepository.findAll();
		model.addAttribute("listeUtilisateurs",Utilisateurss);
		model.addAttribute("ifadmin",role);
	return "VueEnseignant";
	}
	@RequestMapping(value = "/Admin" )
	public String tester2(Model model){
		List<Utilisateur> Utilisateurss = utilisateurRepository.findAll();
		model.addAttribute("listeUtilisateurs",Utilisateurss);
		model.addAttribute("ifadmin",role);
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
			 //v??rifie si p est null ou non. Si il n'est pas null, je cr??er un objet Produit que j'initialise avec p et que j'envois par la suite dans le formulaire via model.
			 Etudiant utilisateur = (Etudiant) p.get();
			  model.addAttribute("listeUtilisateurs",utilisateur);
			  }
	return "VueUpdate";
	}
	@RequestMapping(value = "editEn",method = RequestMethod.GET )
	public String editEn(Model model,int numCin){
		Optional<Utilisateur> p=utilisateurRepository.findById(numCin);
		 if(p.isPresent()) {
			 //v??rifie si p est null ou non. Si il n'est pas null, je cr??er un objet Produit que j'initialise avec p et que j'envois par la suite dans le formulaire via model.
			 Enseignant utilisateur = (Enseignant) p.get();
			  model.addAttribute("listeUtilisateurs",utilisateur);
			  }
	return "ajouterEnseignant";
	}
	@RequestMapping(value = "editAd",method = RequestMethod.GET )
	public String editAd(Model model,int numCin){
		Optional<Utilisateur> p=utilisateurRepository.findById(numCin);
		 if(p.isPresent()) {
			 //v??rifie si p est null ou non. Si il n'est pas null, je cr??er un objet Produit que j'initialise avec p et que j'envois par la suite dans le formulaire via model.
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
    public String saveAd(Model model, Admin utilisateur){    
		utilisateurRepository.save(utilisateur);
        return "redirect:/Admin";    
    } 
	
	
	
	
	//************************delete for all*****************************/

	@RequestMapping(value="/delete/{id}",method = RequestMethod.GET)    
    public String delete(@PathVariable int id){    
		utilisateurRepository.deleteById(id);    
        return "redirect:/index";    
    }   
	

	//************************absence section *****************************/


	@RequestMapping(value = "/formAbs" )
	public String tester00(Model model){
		List<Absence> Abcenses = absenceRepository.findAll();
		model.addAttribute("listeAbcenses",Abcenses);
	return "VueAbsence";
	}
	




	@RequestMapping(value="/saveAbs",method = RequestMethod.POST)    
    public String saveAbs(Model model, Etudiant utilisateur){    
		utilisateurRepository.save(utilisateur);
        return "redirect:/formAbs";    
    }
	@RequestMapping(value = "/Etudiantabsent" )
	public String testerabsete(Model model){
		List<Utilisateur> Utilisateurss = utilisateurRepository.findAll();
		model.addAttribute("listeUtilisateurs",Utilisateurss);
	return "listeAbsence";
	}
	

/**********************************************************************crudd classe **************************************************************************/


/**********affiche**********************/

@RequestMapping(value = "/classe" )
	public String tester7(Model model){
		List<Classe> Classes= classeRepository.findAll();
		model.addAttribute("listeClasses",Classes);
		model.addAttribute("ifadmin",role);
	return "VueClasse";
	}

/**********ajouter**********************/
@RequestMapping(value = "/ajoutercl",method = RequestMethod.GET )
	public String form5(Model model){
		model.addAttribute("listeClasses",new Classe());
	return "ajouterClasse";
	}
	
/**********edit**********************/
	@RequestMapping(value = "editcl",method = RequestMethod.GET )
	public String editcl(Model model,int id_class){
		Optional<Classe> p=classeRepository.findById(id_class);
		 if(p.isPresent()) {
			
			 Classe classe = (Classe) p.get();
			  model.addAttribute("listeClasses",classe);
			  }
	return "ajouterClasse";
	}
	/********************************entrer***********************************/

/********************************save***********************************/
	@RequestMapping(value="/savecl",method = RequestMethod.POST)    
    public String save(Model model, Classe classe){    
		classeRepository.save(classe);
        return "redirect:/classe";    
	}
/**********delete**********************/

	@RequestMapping(value="/deletee/{id}",method = RequestMethod.GET)    
    public String delete2(@PathVariable int id){    
		classeRepository.deleteById(id);    
        return "redirect:/index";  
}

/**********************************************************************crudd compte **************************************************************************/


/**********affiche**********************/

@RequestMapping(value = "/compte" )
	public String tester8(Model model){
		List<Compte> Comptes= compteRepository.findAll();
		model.addAttribute("listeComptes",Comptes);
		model.addAttribute("ifadmin",role);
	return "VueCompte";
	}

/**********ajouter**********************/
@RequestMapping(value = "/ajoutercomp",method = RequestMethod.GET )
	public String form6(Model model){
		model.addAttribute("listeComptes",new Compte());
	return "ajouterCompte";
	}
/**********edit**********************/
@RequestMapping(value = "editcomp",method = RequestMethod.GET )
public String editcomp(Model model,int id_compte){
	Optional<Compte> p=compteRepository.findById(id_compte);
	 if(p.isPresent()) {
		
		 Compte compte = (Compte) p.get();
		  model.addAttribute("listeComptes",compte);
		  }
return "ajouterCompte";
}
/********************************save***********************************/
@RequestMapping(value="/savecomp",method = RequestMethod.POST)    
public String save4(Model model, Compte compte){    
	compteRepository.save(compte);
    return "redirect:/compte";    
}
/**********delete**********************/

@RequestMapping(value="/deleteee/{id}",method = RequestMethod.GET)    
public String deleteee(@PathVariable int id){    
	compteRepository.deleteById(id);    
    return "redirect:/compte";  
}
/**********************************************************************crudd seance**************************************************************************/


/**********affiche**********************/

@RequestMapping(value = "/seance" )
	public String tester10(Model model){
		List<Seance> seances= seanceRepository.findAll();
		model.addAttribute("listeseances",seances);
		model.addAttribute("ifadmin",role);
	return "VueSeance";
	}

/**********ajouter**********************/
@RequestMapping(value = "/ajoutersean",method = RequestMethod.GET )
	public String form8(Model model){
		model.addAttribute("listeseances",new Seance());
	return "ajouterSeance";
	}
/**********edit**********************/
@RequestMapping(value = "editsean",method = RequestMethod.GET )
public String editsean(Model model,int id_sc){
	Optional<Seance> p=seanceRepository.findById(id_sc);
	 if(p.isPresent()) {
		
		 Seance Seance = (Seance) p.get();
		  model.addAttribute("listeseances",Seance);
		  }
return "ajouterSeance";
}
/********************************save***********************************/
@RequestMapping(value="/savesean",method = RequestMethod.POST)    
public String save6(Model model,Seance seance){    
	seanceRepository.save(seance);
    return "redirect:/seance";    
}
/**********delete**********************/

@RequestMapping(value="/deletesean/{id}",method = RequestMethod.GET)    
public String deletesean(@PathVariable int id){    
	seanceRepository.deleteById(id);    
    return "redirect:/seance";  
}
/**********************************************************************crudd matiere**************************************************************************/


/**********affiche**********************/

@RequestMapping(value = "/matiere" )
	public String tester9(Model model){
		List<Matiere> matieres= matiereRepository.findAll();
		model.addAttribute("listematieres",matieres);
		model.addAttribute("ifadmin",role);
	return "VueMatiere";
	}

/**********ajouter**********************/
@RequestMapping(value = "/ajoutermat",method = RequestMethod.GET )
	public String form7(Model model){
		model.addAttribute("listematieres",new Matiere());
	return "ajouterMatiere";
	}
/**********edit**********************/
@RequestMapping(value = "editmat",method = RequestMethod.GET )
public String editmat(Model model,int id_Matiere){
	Optional<Matiere> p=matiereRepository.findById(id_Matiere);
	 if(p.isPresent()) {
		
		 Matiere matiere = (Matiere) p.get();
		  model.addAttribute("listematieres",matiere);
		  }
return "ajouterMatiere";
}
/********************************save***********************************/
@RequestMapping(value="/savemat",method = RequestMethod.POST)    
public String save5(Model model, Matiere matiere){    
	matiereRepository.save(matiere);
    return "redirect:/matiere";    
}
/**********delete**********************/

@RequestMapping(value="/deletemat/{id}",method = RequestMethod.GET)    
public String deletemat(@PathVariable int id){    
	matiereRepository.deleteById(id);    
    return "redirect:/matiere";  
}





















/**********starter**********************/


@RequestMapping("/entrercl")
public String consulterCompte(Model model, int id_class) {
//compl??ter le code

	id_class4keys=id_class;
	model.addAttribute("id_class",id_class);
	List<Enseigne> Enseignes= enseRepository.findAll();
	model.addAttribute("Enseignes",Enseignes);


return "redirect:/seance2?id_class="+id_class;
}
/**********affiche seance**********************/



@RequestMapping(value = "/seance2" )
	public String testeqq(Model model,int id_class){
		List<Seance> seances= seanceRepository.findAll();
		model.addAttribute("listeseances",seances);
		model.addAttribute("ifadmin",role);
		Enseigne enseigness=enseRepository.getOne(id_class);
		model.addAttribute("enseigness",enseigness);	
	    model.addAttribute("id_class",id_class);	
			
	return "VueSeance4profs";
	}


@RequestMapping(value = "/VueSeance4profs" )
public String testerss(Model model,int id_class){
	List<Utilisateur> Utilisateurss = utilisateurRepository.findAll();
	model.addAttribute("listeUtilisateurss",Utilisateurss);
	model.addAttribute("ifadmin",role);
	Enseigne enseigness=enseRepository.getOne(id_class);
	model.addAttribute("enseigness",enseigness);	
	

return "VueEtudiant4profs2";
}


/**********all the previous is okk don t f---- touch it 
 * hedhi chteba3thek lel vue des etudes
 * **********************/






@RequestMapping(value = "/entrer4etuds" )
	public String testeqsq(Model model,int id_sc){
	
		List<Seance> seances= seanceRepository.findAll();
		model.addAttribute("listeseances",seances);
			
		Seance Seances=seanceRepository.getOne(id_sc);
		model.addAttribute("Seances",Seances);			
				
		List<Utilisateur> Utilisateurss = utilisateurRepository.findAll();
		model.addAttribute("listeUtilisateurss",Utilisateurss);
		model.addAttribute("ifadmin",role);
		Enseigne enseigness=enseRepository.getOne(id_class4keys);
		model.addAttribute("enseigness",enseigness);	
		id_s5=id_sc;
		id_s =Seances;
		

	return "VueEtudiant4profs2";
	}







@RequestMapping(value="/saveOperation")
public String saveOperation(Model model,int numCin) {

	

	List<Seance> seances= seanceRepository.findAll();
	model.addAttribute("listeseances",seances);
		
	Seance Seances=seanceRepository.getOne(id_s5);
	model.addAttribute("Seances",Seances);			
	
	Enseigne enseigness=enseRepository.getOne(id_class4keys);
	model.addAttribute("enseigness",enseigness);	

	
	List<Utilisateur> Utilisateurss = utilisateurRepository.findAll();
	model.addAttribute("listeUtilisateurss",Utilisateurss);
	Etudiant User=(Etudiant) utilisateurRepository.getOne(numCin);
	Absence abs=new Absence(id_s,User);
	model.addAttribute("ifadmin",role);
	model.addAttribute("abs",abs);
	absenceRepository.save(abs);
return "VueEtudiant4profs2";
} 


@RequestMapping(value="/saveOperation2")
public String saveOperation2(Model model,int numCin) {

	

	List<Seance> seances= seanceRepository.findAll();
	model.addAttribute("listeseances",seances);
		
	Seance Seances=seanceRepository.getOne(id_s5);
	model.addAttribute("Seances",Seances);			
	
	Enseigne enseigness=enseRepository.getOne(id_class4keys);
	model.addAttribute("enseigness",enseigness);	

	
	List<Utilisateur> Utilisateurss = utilisateurRepository.findAll();
	model.addAttribute("listeUtilisateurss",Utilisateurss);
	Etudiant User=(Etudiant) utilisateurRepository.getOne(numCin);
	Retard ret=new Retard(id_s,User);
	model.addAttribute("ifadmin",role);
	model.addAttribute("ret",ret);
	retardRepository.save(ret);
return "VueEtudiant4profs2";
} 




/******************retards****************/

@RequestMapping(value = "/formRet" )
public String tester45(Model model){
	List<Retard> Retards = retardRepository.findAll();
	model.addAttribute("listeRetards",Retards);
return "VueRetard";
}
@RequestMapping(value="/saveRet",method = RequestMethod.POST)    
public String saveRet(Model model, Etudiant utilisateur){    
	utilisateurRepository.save(utilisateur);
    return "redirect:/formRet";    
}


@RequestMapping(value = "/Etudiantretard" )
public String testeret(Model model){
	List<Utilisateur> Utilisateurss = utilisateurRepository.findAll();
	model.addAttribute("listeUtilisateurs",Utilisateurss);
return "listeRetard";
}





}