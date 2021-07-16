package tn.elifebeja.entity;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue(value="tech")
public class MissionExterne extends Mission implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String emailFacturation;
	private String tauxJournalierMoyen;
	public MissionExterne() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MissionExterne(String emailFacturation, String tauxJournalierMoyen) {
		super();
		this.emailFacturation = emailFacturation;
		this.tauxJournalierMoyen = tauxJournalierMoyen;
	}
	public String getEmailFacturation() {
		return emailFacturation;
	}
	public void setEmailFacturation(String emailFacturation) {
		this.emailFacturation = emailFacturation;
	}
	public String getTauxJournalierMoyen() {
		return tauxJournalierMoyen;
	}
	public void setTauxJournalierMoyen(String tauxJournalierMoyen) {
		this.tauxJournalierMoyen = tauxJournalierMoyen;
	}

}
