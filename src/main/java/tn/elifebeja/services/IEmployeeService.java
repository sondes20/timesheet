package tn.elifebeja.services;

import java.util.List;

import tn.elifebeja.entity.Contrat;
import tn.elifebeja.entity.Departement;
import tn.elifebeja.entity.Employee;

public interface IEmployeeService {
	
	public long ajouterEmployee (Employee employe);
	public void affecterEmployeADepartement (long employeeId , long depId);
	public int ajouterContrat (Contrat contrat);
	public void affecterContratAEmploye (long contratId , long employeId);
	public String getEmployePrenomById (int employeId);
	public long getNombreEmployeJPQL();
	public List<String> getAllEmployeNamesJPQL();
	public int ajouterEmploye(Employee employee);
	public List<Employee> listemploye ();
	public void affecterEmployeDepartement(Employee user, Departement dep);
	public List<Employee> getAllEmployeeByEntreprise (int identr);
	public Employee getEmploye(String nom, String pwd);
	public void mettreAjourEmailByEmployeId(String email, int employeId);
	

}
