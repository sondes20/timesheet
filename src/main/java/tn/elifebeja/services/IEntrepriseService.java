package tn.elifebeja.services;

import java.util.List;

import tn.elifebeja.entity.Departement;
import tn.elifebeja.entity.Entreprise;

public interface IEntrepriseService {
	
	public long ajouterEntreprise1(Entreprise entreprise);
	public long ajouterDepartement(Departement dep);
	void affecterDepartementAEntreprise (long depId , long entrepriseId);
	List<String> getAllDepartementsNamesByEntreprise (long entrepriseId);

}
