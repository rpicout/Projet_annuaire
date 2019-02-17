package fr.ima.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import fr.ima.service.EtablissementService;

@Controller
public class PageListEtablissementController {
	
	@Autowired
	private EtablissementService dao;

    @GetMapping("/listeDesEtablissements")
    public String AfficherListeDesEtablissements(Model model) {
    	model.addAttribute("etablissements", dao.lister());
        return "listeDesEtablissements";
    }
    
    @GetMapping("/rechercheCodePostal{codepostal}")
    public String AfficherParCodePostal(Model model, @PathVariable String codepostal) {
    	model.addAttribute("etablissements", dao.findByCodePostal(codepostal));
        return "rechercheCodePostal";
    }

}
