package tn.elifebeja;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.elifebeja.entity.Contrat;
import tn.elifebeja.entity.Departement;
import tn.elifebeja.entity.Employee;
import tn.elifebeja.entity.Entreprise;
import tn.elifebeja.entity.Role;
import tn.elifebeja.services.IDepartementService;
import tn.elifebeja.services.IEmployeeService;
import tn.elifebeja.services.IEntrepriseService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TpTimeSheetApplicationTests {
	@Autowired
	IEntrepriseService es;
	@Autowired
	IDepartementService ds;
	@Autowired
	IEmployeeService employeeService;
	private static final Logger l = LogManager.getLogger(TpTimeSheetApplicationTests.class);
	@Test
	public void contextLoads() throws ParseException{
		
		//Entreprise e1 = new Entreprise("SSII Consulting", "abc");
		//Departement d1 = new Departement("RH");
		//Departement d2 = new Departement("Telecom");
		
		/*ds.ajouterDepartement(d1);
		ds.ajouterDepartement(d2);
		es.ajouterEntreprise1(e1);*/
		
		/*Employee emp1 = new Employee("Yosra", "Arbi", "yosra.arbi@ssiiconsulting.tn", true, Role.CHEFDEPARTEMENT);
		Employee emp2 = new Employee("Mohamed", "Zitouni", "mohamed.zitouni@ssiiconsulting.tn", true, Role.TECHNICIEN);
		Employee emp3 = new Employee("Aymen", "Oueli", "aymen.oueli@ssiiconsulting.tn", true, Role.INGENIEUR);
		Employee emp4 = new Employee("Bochra", "Bouzidi", "bochra.bouzidi@ssiiconsulting.tn", true, Role.CHEFDEPARTEMENT);
		Employee emp5 = new Employee("Khaled", "Kallel", "khaled.kallel@ssiiconsulting.tn", true, Role.INGENIEUR);*/
		/*employeeService.ajouterEmployee(emp1);
		employeeService.ajouterEmployee(emp2);
		employeeService.ajouterEmployee(emp3);
		employeeService.ajouterEmployee(emp4);
		employeeService.ajouterEmployee(emp5);*/
		/*SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date d1 = dateFormat.parse("2015-02-01");
		Contrat c1 = new Contrat(d1,"CDI", 1600);
		Date d2 = dateFormat.parse("2010-03-01");
		Contrat c2 = new Contrat(d2,"CDI", 2600);
		Date d3 = dateFormat.parse("2013-05-15");
		Contrat c3 = new Contrat(d3,"CDI", 900);
		Date d4 = dateFormat.parse("2014-05-10");
		Contrat c4 = new Contrat(d4,"CDI", 2000);
		Date d5 = dateFormat.parse("2010-06-12");
		Contrat c5 = new Contrat(d5,"CDI", 2700);
		employeeService.ajouterContrat(c1);
		employeeService.ajouterContrat(c2);
		employeeService.ajouterContrat(c3);
		employeeService.ajouterContrat(c4);
		employeeService.ajouterContrat(c5);*/
		
		/*Entreprise e = es.retrieveEntreprise(1);
		e.setRaisonSocial("Cité El Ghazela");
		es.miseAJourEntreprise(e);*/
		
		/*employeeService.affecterContratAEmploye(1, 1);
		employeeService.affecterContratAEmploye(2, 5);
		employeeService.affecterContratAEmploye(3, 2);
		employeeService.affecterContratAEmploye(4, 3);
		employeeService.affecterContratAEmploye(5, 4);*/
		
		
		//l.info("Le prenom de l'employe est:" +  employeeService.getEmployePrenomById(1));
		
		//l.info("Le nombre des employes est " + employeeService.getNombreEmployeJPQL());
         
		/*for(String nom: employeeService.getAllEmployeNamesJPQL()){
			l.info("Le nom de l'employe est : " + nom);
		}*/
		
		//employeeService.listemploye();
		
		/*es.affecterDepartementAEntreprise(1, 1);
		es.affecterDepartementAEntreprise(2, 1);*/
		
		//es.affecterDepartementAEntreprise(2, 1);
		/*for(String nom:es.getAllDepartementsNamesByEntreprise(1))
		l.info(nom);*/
		
		//l.info(employeeService.getEmploye("Zitouni", "mohamed.zitouni@ssiiconsulting.tn"));
		
		
		//employeeService.affecterEmployeADepartement(1, 2);
		//employeeService.affecterEmployeADepartement(2, 2);
		//employeeService.affecterEmployeADepartement(4, 2);
		//employeeService.affecterEmployeADepartement(1, 1);
		
		employeeService.affecterEmployeADepartement(4, 1);
		//employeeService.affecterEmployeADepartement(3, 1);
		//employeeService.affecterEmployeADepartement(5, 1);
		
		//employeeService.mettreAjourEmailByEmployeId("kallel.khaled@ssiiconsulting.tn", 5);
		
		//employeeService.affecterEmployeDepartement(emp2, d1);
		/*for(Employee e : employeeService.getAllEmployeeByEntreprise(1))
		l.info(e);*/
		
		
	}
	public static Logger getL() {
		return l;
	}

}
