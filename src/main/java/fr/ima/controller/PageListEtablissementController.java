package fr.ima.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fr.ima.service.EtablissementService;

@Controller
public class PageListEtablissementController {
	
	@Autowired
	private EtablissementService dao;

    @GetMapping("/listeDesEtablissements")
    public String afficherListeDesEtablissements(Model model) {
        model.addAttribute("etablissements", dao.lister());
        return "listeDesEtablissements";
    }

}
