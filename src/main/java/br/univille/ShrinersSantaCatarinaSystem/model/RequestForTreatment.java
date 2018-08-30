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
	private boolean canceled = false;
	@ManyToOne(cascade= {CascadeType.MERGE,CascadeType.REFRESH, CascadeType.PERSIST})
	private Demographics demographics = new Demographics();
	@ManyToOne(cascade= {CascadeType.MERGE,CascadeType.REFRESH, CascadeType.PERSIST})
	private MedicalInformation medicalInformation = new MedicalInformation();
	@ManyToOne(cascade= {CascadeType.MERGE,CascadeType.REFRESH, CascadeType.PERSIST})
	private ShrinersInfo shrinersInfo = new ShrinersInfo();
	@ManyToOne(cascade= {CascadeType.MERGE,CascadeType.REFRESH, CascadeType.PERSIST})
	private DoctorReferralInfo doctorReferralInfo = new DoctorReferralInfo();
	@ManyToOne(cascade= {CascadeType.MERGE,CascadeType.REFRESH, CascadeType.PERSIST})
	private ReferringTempleShriner referringTempleShriner = new ReferringTempleShriner();
	@ManyToOne(cascade= {CascadeType.MERGE,CascadeType.REFRESH, CascadeType.PERSIST})
	private LegalGuardianInfo motherLegalGuardianInfo = new LegalGuardianInfo("MOTHER");
	@ManyToOne(cascade= {CascadeType.MERGE,CascadeType.REFRESH, CascadeType.PERSIST})
	private LegalGuardianInfo fatherLegalGuardianInfo = new LegalGuardianInfo("FATHER");
	@ManyToOne(cascade= {CascadeType.MERGE,CascadeType.REFRESH, CascadeType.PERSIST})
	private LegalGuardianInfo legalGuardianInfo = new LegalGuardianInfo();
	@ManyToOne(cascade= {CascadeType.MERGE,CascadeType.REFRESH, CascadeType.PERSIST})
	private LegalGuardianInfo aditionalLegalGuardianInfo = new LegalGuardianInfo();
	@ManyToOne(cascade= {CascadeType.REFRESH})
	private WorkflowStep workflowStep;
	
	
	public WorkflowStep getWorkflowStep() {
		return workflowStep;
	}
	public void setWorkflowStep(WorkflowStep workflowStep) {
		this.workflowStep = workflowStep;
	}
	public boolean isCanceled() {
		return canceled;
	}
	public void setCanceled(boolean canceled) {
		this.canceled = canceled;
	}
	public LegalGuardianInfo getAditionalLegalGuardianInfo() {
		return aditionalLegalGuardianInfo;
	}
	public void setAditionalLegalGuardianInfo(LegalGuardianInfo aditionalLegalGuardianInfo) {
		this.aditionalLegalGuardianInfo = aditionalLegalGuardianInfo;
	}
	public ReferringTempleShriner getReferringTempleShriner() {
		return referringTempleShriner;
	}
	public void setReferringTempleShriner(ReferringTempleShriner referringTempleShriner) {
		this.referringTempleShriner = referringTempleShriner;
	}
	public LegalGuardianInfo getMotherLegalGuardianInfo() {
		return motherLegalGuardianInfo;
	}
	public void setMotherLegalGuardianInfo(LegalGuardianInfo motherLegalGuardianInfo) {
		this.motherLegalGuardianInfo = motherLegalGuardianInfo;
	}
	public LegalGuardianInfo getFatherLegalGuardianInfo() {
		return fatherLegalGuardianInfo;
	}
	public void setFatherLegalGuardianInfo(LegalGuardianInfo fatherLegalGuardianInfo) {
		this.fatherLegalGuardianInfo = fatherLegalGuardianInfo;
	}
	public LegalGuardianInfo getLegalGuardianInfo() {
		return legalGuardianInfo;
	}
	public void setLegalGuardianInfo(LegalGuardianInfo legalGuardianInfo) {
		this.legalGuardianInfo = legalGuardianInfo;
	}
	public DoctorReferralInfo getDoctorReferralInfo() {
		return doctorReferralInfo;
	}
	public void setDoctorReferralInfo(DoctorReferralInfo doctorReferralInfo) {
		this.doctorReferralInfo = doctorReferralInfo;
	}
	public ShrinersInfo getShrinersInfo() {
		return shrinersInfo;
	}
	public void setShrinersInfo(ShrinersInfo shrinersInfo) {
		this.shrinersInfo = shrinersInfo;
	}
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
