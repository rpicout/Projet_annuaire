package fr.ima.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.ima.beans.Etablissement;
import fr.ima.service.EtablissementService;

@Controller
public class PageListEtablissementController {
	Logger logger = Logger.getLogger(PageListEtablissementController.class.getName());
	
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

    @GetMapping("/modifierEtablissement{id}")
    public String AfficherParID(Model model, @PathVariable String id) {
    	model.addAttribute("etablissements", dao.findByID(id));
        return "modifierEtablissement";
    }

    @RequestMapping(value = "/postEtablissement", method=RequestMethod.POST)
    public String processForm(@ModelAttribute(value="etablissement") Etablissement etablissement) {
    	System.out.println("Etablissement : "  +etablissement);
    	System.out.println(etablissement.getTelephone());
    	dao.postEtablissement(etablissement);
    	return "modifierEtablissement";
    }
}
