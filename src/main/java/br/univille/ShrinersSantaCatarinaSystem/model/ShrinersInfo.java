package br.univille.ShrinersSantaCatarinaSystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ShrinersInfo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private HowHearAbout howHearAbout;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public HowHearAbout getHowHearAbout() {
		return howHearAbout;
	}
	public void setHowHearAbout(HowHearAbout howHearAbout) {
		this.howHearAbout = howHearAbout;
	}
	
}

enum HowHearAbout {
	FAMILYMEMBER, OTHERHEALTHCAREPROFESSIONAL, SCHOOL, TEMPLESCREENINGCLINIC, FRIEND, OHTERMEDIA, SHRINER, WEBSITE, 
	PHYSICIAN, TELEVISION, OTHER;
}
