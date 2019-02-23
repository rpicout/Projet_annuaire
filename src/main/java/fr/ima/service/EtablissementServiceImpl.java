package fr.ima.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import fr.ima.beans.Etablissement;

@Service
public class EtablissementServiceImpl implements EtablissementService {

	@Autowired
	public RestTemplate restTemplate;
	
	@Override
	public List<Etablissement> lister() {

		// Construction de l'URL pour l'appel su WS
		String url = "http://localhost:8081/etablissements";

		// Appel du WS Rest
		List<Etablissement> etablissements = (List<Etablissement>) restTemplate.getForObject(url, List.class, url);
		
		return etablissements;
	}
	
	@Override
	public List<Etablissement> findByCodePostal(String codepostal) {
		// Construction de l'URL pour l'appel su WS
		String url = "http://localhost:8081/etablissements/codePostal/"+codepostal;

		// Appel du WS Rest
		List<Etablissement> etablissements = (List<Etablissement>) restTemplate.getForObject(url, List.class, url);
				
		return etablissements;
	}

	@Override
	public List<Etablissement> findByID(String id) {
		String url = "http://localhost:8081/etablissements/id/"+id;
		
		List<Etablissement> etablissements = (List<Etablissement>)restTemplate.getForObject(url,  List.class, url);
		
		return etablissements;
	}
	
	

}
