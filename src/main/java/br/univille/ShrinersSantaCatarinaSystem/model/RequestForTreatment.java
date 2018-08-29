package br.univille.ShrinersSantaCatarinaSystem.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class RequestForTreatment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Temporal(value=TemporalType.TIMESTAMP)
	private Date requestDate = new Date();
	@ManyToOne(cascade= {CascadeType.MERGE,CascadeType.REFRESH, CascadeType.PERSIST})
	private Demographics demographics = new Demographics();
	@ManyToOne(cascade= {CascadeType.MERGE,CascadeType.REFRESH, CascadeType.PERSIST})
	private MedicalInformation medicalInformation = new MedicalInformation();
	
	
	
	public MedicalInformation getMedicalInformation() {
		return medicalInformation;
	}
	public void setMedicalInformation(MedicalInformation medicalInformation) {
		this.medicalInformation = medicalInformation;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getRequestDate() {
		return requestDate;
	}
	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}
	public Demographics getDemographics() {
		return demographics;
	}
	public void setDemographics(Demographics demographics) {
		this.demographics = demographics;
	}
}
