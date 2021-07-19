package tn.elifebeja.services;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.elifebeja.entity.Contrat;
import tn.elifebeja.entity.Departement;
import tn.elifebeja.entity.Employee;
import tn.elifebeja.repository.ContratRepository;
import tn.elifebeja.repository.DepartementRepository;
import tn.elifebeja.repository.EmployeeRepository;
import tn.elifebeja.repository.EntrepriseRepository;

@Service
public class EmployeeService implements IEmployeeService {
	
	@Autowired
	EmployeeRepository empRepo;
	
	@Autowired
	DepartementRepository deptRepo;
	
	@Autowired
	ContratRepository contratRepo;
	
	@Autowired
	EntrepriseRepository entreRepo;
	private static final Logger l = LogManager.getLogger(EmployeeService.class);
	@Override
	public long ajouterEmployee(Employee employe) {
		// TODO Auto-generated method stub
		return empRepo.save(employe).getId();
	}
    
	@Override
	public void affecterEmployeADepartement(long employeeId, long depId) {
		// TODO Auto-generated method stub
		Employee emp = empRepo.findById(employeeId).get();
		Departement dept = deptRepo.findById(depId).get();
		//emp.getDepartements().add(dept);
		dept.getEmployees().add(emp);
		deptRepo.save(dept);
		
	}

	@Override
	public long ajouterContrat(Contrat contrat) {
		// TODO Auto-generated method stub
		return contratRepo.save(contrat).getReference();
	}

	@Override
	public void affecterContratAEmploye(long contratId, long employeId) {
		// TODO Auto-generated method stub
		Contrat c1 = contratRepo.findById(contratId).get();
		Employee e = empRepo.findById(employeId).get();
		e.setContrat(c1);
		empRepo.save(e);
		
	}

	@Override
	public String getEmployePrenomById(long employeId) {
		// TODO Auto-generated method stub
		Employee e = empRepo.findById(employeId).get();
		return e.getPrenom();
	}

	@Override
	public long getNombreEmployeJPQL() {
		// TODO Auto-generated method stub
		return empRepo.getCountEmployee();
	}

	@Override
	public List<String> getAllEmployeNamesJPQL() {
		// TODO Auto-generated method stub
		return empRepo.getNomEmployee();
	}

	@Override
	public List<Employee> listemploye() {
		// TODO Auto-generated method stub
		List<Employee> employees = (List<Employee>)empRepo.findAll();
		for(Employee e : employees)
		l.info("L'employe "+e.getId() + "est : "+ e);
		return employees;
	}

	@Override
	public void affecterEmployeDepartement(Employee user, Departement dep) {
		// TODO Auto-generated method stub
		user.getDepartements().add(dep);
		dep.getEmployees().add(user);
		deptRepo.save(dep);
		
	}

	@Override
	public List<Employee> getAllEmployeeByEntreprise(long identr) {
		
		return empRepo.listEmployeeByEntreprise(identr);
	}

	@Override
	public Employee getEmploye(String nom, String pwd) {
		// TODO Auto-generated method stub
		
		return empRepo.findByNomAndEmail(nom, pwd);
	}

	@Override
	public void mettreAjourEmailByEmployeId(String email, long employeId) {
		// TODO Auto-generated method stub
		Employee e = empRepo.findById(employeId).get();
		e.setEmail(email);
		empRepo.save(e);
		
	}
	
	

}
