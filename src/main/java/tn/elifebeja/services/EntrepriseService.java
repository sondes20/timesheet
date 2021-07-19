package tn.elifebeja.services;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.elifebeja.entity.Departement;
import tn.elifebeja.entity.Entreprise;
import tn.elifebeja.repository.DepartementRepository;
import tn.elifebeja.repository.EntrepriseRepository;

@Service
public class EntrepriseService implements IEntrepriseService {
	
	private static final Logger l = LogManager.getLogger(EntrepriseService.class);
	
	@Autowired
	EntrepriseRepository entrepriseRepo;
	
	@Autowired
	DepartementRepository deptRepo;

	@Override
	public long ajouterDepartement(Departement dep) {
		// TODO Auto-generated method stub
		Departement dept = deptRepo.save(dep);
		return dept.getId();
	}

	@Override
	public void affecterDepartementAEntreprise(long depId, long entrepriseId) {
		// TODO Auto-generated method stub
		Departement dept = deptRepo.findById(depId).get();
		Entreprise entre = entrepriseRepo.findById(entrepriseId).get();
		List<Departement> listDept = (List<Departement>)deptRepo.findAll();
		if(listDept.contains(entre)){
		dept.setEntreprise(entre);
		deptRepo.save(dept);
		}else{
			l.error("Le département existe déja!");
		}
		
	}

	@Override
	public List<String> getAllDepartementsNamesByEntreprise(long entrepriseId) {
		// TODO Auto-generated method stub
		List<String> lnom = new ArrayList<String>();
		Entreprise entre = entrepriseRepo.findById(entrepriseId).get();
		List<Departement> deptList = entre.getDepartements();
		for(Departement d:deptList){
			lnom.add(d.getName());
		}
		
		return lnom;
	}

	@Override
	public long ajouterEntreprise1(Entreprise entreprise) {
		// TODO Auto-generated method stub
		Entreprise e = entrepriseRepo.save(entreprise);
		return e.getId();
	}

	public static Logger getL() {
		return l;
	}

	@Override
	public long miseAJourEntreprise(Entreprise e) {
		// TODO Auto-generated method stub
		return entrepriseRepo.save(e).getId();
	}

	@Override
	public Entreprise retrieveEntreprise(long id) {
		// TODO Auto-generated method stub
		return entrepriseRepo.findById(id).get();
	}

}
