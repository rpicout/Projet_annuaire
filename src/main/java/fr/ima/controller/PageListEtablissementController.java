package fr.ima.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import fr.ima.beans.Etablissement;
import fr.ima.service.EtablissementService;
import fr.ima.service.EtablissementServiceImpl;

@Controller
public class PageListEtablissementController {
	
	@Autowired
	private EtablissementService dao;

    @GetMapping("/listeDesEtablissements")
    public String AfficherListeDesEtablissements(Model model) {
    	model.addAttribute("etablissements", dao.lister());
        return "listeDesEtablissements";
    }
    
    @GetMapping("/rechercheCodePostal")
    public String AfficherParCodePostal(Model model) {
    	String code_postal = "12400";
    	model.addAttribute("etablissements", dao.findByCodePostal(code_postal));
        return "rechercheCodePostal";
    }
    
   
    

}
