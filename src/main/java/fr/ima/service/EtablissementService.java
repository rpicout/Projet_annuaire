package fr.ima.service;

import java.util.List;

import fr.ima.beans.Etablissement;

public interface EtablissementService {
	
	public List<Etablissement> lister();

	public List<Etablissement> findByCodePostal(String code_postal);

	public List<Etablissement> findByID(String id);
}
