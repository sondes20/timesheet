package tn.elifebeja.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.elifebeja.entity.Departement;
import tn.elifebeja.repository.DepartementRepository;
@Service
public class DepartementService implements IDepartementService {
	
	@Autowired
	DepartementRepository deptRepo;

	@Override
	public long ajouterDepartement(Departement dept) {
		// TODO Auto-generated method stub
		
		return deptRepo.save(dept).getId();
	}



}
