package tn.elifebeja;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.elifebeja.entity.Departement;
import tn.elifebeja.entity.Entreprise;
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
	IEmployeeService empS;
	private static final Logger l = LogManager.getLogger(TpTimeSheetApplicationTests.class);
	@Test
	public void contextLoads() {
		
		/*Entreprise e1 = new Entreprise("SSII Consulting", "abc");
		Departement d1 = new Departement("RH");
		Departement d2 = new Departement("Telecom");
		
		ds.ajouterDepartement(d1);
		ds.ajouterDepartement(d2);
		es.ajouterEntreprise1(e1);*/
		
		es.affecterDepartementAEntreprise(1, 1);
		es.affecterDepartementAEntreprise(2, 1);
		
		
	}

}
