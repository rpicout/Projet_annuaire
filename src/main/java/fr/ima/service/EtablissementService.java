package fr.ima.service;

import java.util.List;

import fr.ima.beans.Etablissement;

public interface EtablissementService {
	
	public List<Etablissement> lister();

	public List<Etablissement> findByCodePostal(String codePostal);

	public List<Etablissement> findByID(String id);
	
	public void postEtablissement(Etablissement etablissement);
}
