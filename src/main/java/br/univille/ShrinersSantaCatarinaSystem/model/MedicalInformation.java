package br.univille.ShrinersSantaCatarinaSystem.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class MedicalInformation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String medicalProblemDescription;
	private OnsetOfProblem onsetOfProblem;
	@Temporal(value=TemporalType.TIMESTAMP)
	private Date dateOnsetOfProblem;
	private String whatMedicalCareOrServiceLookingFor;
	private String whatPreviousTreatments;
	private ChildAmbulationStatus childAmbulationStatus;
	private String childAmbulationStatusOther;
	private boolean xRayAvailable;
	@Temporal(value=TemporalType.TIMESTAMP)
	private Date dateMostRecentXRay;
	@Temporal(value=TemporalType.TIMESTAMP)
	private Date dateLastSeeByPhysician;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMedicalProblemDescription() {
		return medicalProblemDescription;
	}
	public void setMedicalProblemDescription(String medicalProblemDescription) {
		this.medicalProblemDescription = medicalProblemDescription;
	}
	public OnsetOfProblem getOnsetOfProblem() {
		return onsetOfProblem;
	}
	public void setOnsetOfProblem(OnsetOfProblem onsetOfProblem) {
		this.onsetOfProblem = onsetOfProblem;
	}
	public Date getDateOnsetOfProblem() {
		return dateOnsetOfProblem;
	}
	public void setDateOnsetOfProblem(Date dateOnsetOfProblem) {
		this.dateOnsetOfProblem = dateOnsetOfProblem;
	}
	public String getWhatMedicalCareOrServiceLookingFor() {
		return whatMedicalCareOrServiceLookingFor;
	}
	public void setWhatMedicalCareOrServiceLookingFor(String whatMedicalCareOrServiceLookingFor) {
		this.whatMedicalCareOrServiceLookingFor = whatMedicalCareOrServiceLookingFor;
	}
	public String getWhatPreviousTreatments() {
		return whatPreviousTreatments;
	}
	public void setWhatPreviousTreatments(String whatPreviousTreatments) {
		this.whatPreviousTreatments = whatPreviousTreatments;
	}
	public ChildAmbulationStatus getChildAmbulationStatus() {
		return childAmbulationStatus;
	}
	public void setChildAmbulationStatus(ChildAmbulationStatus childAmbulationStatus) {
		this.childAmbulationStatus = childAmbulationStatus;
	}
	public String getChildAmbulationStatusOther() {
		return childAmbulationStatusOther;
	}
	public void setChildAmbulationStatusOther(String childAmbulationStatusOther) {
		this.childAmbulationStatusOther = childAmbulationStatusOther;
	}
	public boolean isxRayAvailable() {
		return xRayAvailable;
	}
	public void setxRayAvailable(boolean xRayAvailable) {
		this.xRayAvailable = xRayAvailable;
	}
	public Date getDateMostRecentXRay() {
		return dateMostRecentXRay;
	}
	public void setDateMostRecentXRay(Date dateMostRecentXRay) {
		this.dateMostRecentXRay = dateMostRecentXRay;
	}
	public Date getDateLastSeeByPhysician() {
		return dateLastSeeByPhysician;
	}
	public void setDateLastSeeByPhysician(Date dateLastSeeByPhysician) {
		this.dateLastSeeByPhysician = dateLastSeeByPhysician;
	}
	
}
enum OnsetOfProblem {
	BEFOREBIRTH, CONGENITAL, DEVELOPEDRECENTLY, INJURYDATEUNKNOW, INJURYDATEKNOW, ONSETOFWALKING, SINCEBIRTH, OTHER;
}
enum ChildAmbulationStatus {
	WALKUNASSISTED, WALKER, WHEELCHAIR, CRUTCHES, CANE, OTHER;
}
