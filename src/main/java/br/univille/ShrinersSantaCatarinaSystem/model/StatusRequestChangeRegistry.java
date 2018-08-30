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
public class StatusRequestChangeRegistry {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@ManyToOne(cascade= {CascadeType.MERGE,CascadeType.REFRESH})
	private RequestForTreatment request;
	@Temporal(value=TemporalType.TIMESTAMP)
	private Date dateChange = new Date();
	private String description;
	@ManyToOne(cascade= {CascadeType.MERGE,CascadeType.REFRESH})
	private WorkflowStep workflowStep;
	
	public WorkflowStep getWorkflowStep() {
		return workflowStep;
	}
	public void setWorkflowStep(WorkflowStep workflowStep) {
		this.workflowStep = workflowStep;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public RequestForTreatment getRequest() {
		return request;
	}
	public void setRequest(RequestForTreatment request) {
		this.request = request;
	}
	public Date getDateChange() {
		return dateChange;
	}
	public void setDateChange(Date dateChange) {
		this.dateChange = dateChange;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
