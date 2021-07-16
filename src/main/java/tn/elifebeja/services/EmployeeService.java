package tn.elifebeja.services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.elifebeja.entity.Contrat;
import tn.elifebeja.entity.Departement;
import tn.elifebeja.entity.Employee;
import tn.elifebeja.repository.EmployeeRepository;

@Service
public class EmployeeService implements IEmployeeService {
	
	@Autowired
	EmployeeRepository empRepo;
	
	@Autowired
	EmployeeRepository deptRepo;

	@Override
	public long ajouterEmployee(Employee employe) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void affecterEmployeADepartement(long employeeId, long depId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int ajouterContrat(Contrat contrat) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void affecterContratAEmploye(long contratId, long employeId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getEmployePrenomById(int employeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getNombreEmployeJPQL() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<String> getAllEmployeNamesJPQL() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int ajouterEmploye(Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Employee> listemploye() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void affecterEmployeDepartement(Employee user, Departement dep) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> getAllEmployeeByEntreprise(int identr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmploye(String nom, String pwd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void mettreAjourEmailByEmployeId(String email, int employeId) {
		// TODO Auto-generated method stub
		
	}
	
	

}
