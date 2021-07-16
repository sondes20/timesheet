package tn.elifebeja.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.elifebeja.entity.Mission;
import tn.elifebeja.repository.TimesheetRepository;
@Service
public class TimesheetService implements ITimesheetService {
	
	@Autowired
	TimesheetRepository timesheetRepo;

	@Override
	public int ajouterMission(Mission mission) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void affecterMissionADepartement(int missionId, int depId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void ajouterTimesheet(int missionId, int employeId, Date dateDebut, Date dateFin) {
		// TODO Auto-generated method stub

	}

}
