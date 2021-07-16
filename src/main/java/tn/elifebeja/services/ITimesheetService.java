package tn.elifebeja.services;

import java.util.Date;

import tn.elifebeja.entity.Mission;

public interface ITimesheetService {
	
	public int ajouterMission (Mission mission);
	public void affecterMissionADepartement (int missionId , int depId);
	public void ajouterTimesheet (int missionId , int employeId , Date dateDebut , Date dateFin);

}
