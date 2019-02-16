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
		List<Etablissement> etablissement = (List<Etablissement>) restTemplate.getForObject(url, List.class, url);
		
		return etablissement;
	}
	
	@Override
	public List<Etablissement> findByCodePostal(String code_postal) {
		// Construction de l'URL pour l'appel su WS
		String url = "http://localhost:8081/etablissements";

		// Appel du WS Rest
		List<Etablissement> etablissement = (List<Etablissement>) restTemplate.getForObject(url, List.class,url);
				
		return etablissement;
	}

}
