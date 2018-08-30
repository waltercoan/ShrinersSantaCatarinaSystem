package br.univille.ShrinersSantaCatarinaSystem.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class WorkflowStep {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private WorkflowStatus workflowStatus;
	private boolean startStep;
	private boolean endStep;
	@OneToMany(cascade=CascadeType.ALL)
	private List<WorkflowStep> nextWorkflowSteps = new ArrayList<WorkflowStep>(); 
	@ManyToOne(cascade=CascadeType.ALL)
	private WorkflowStep prevWorkflowSteps;
	
	public WorkflowStep() {
		// TODO Auto-generated constructor stub
	}
	public WorkflowStep(WorkflowStatus workflowStatus,boolean startStep,boolean endStep, WorkflowStep prevWorkflowSteps) {
		this.setWorkflowStatus(workflowStatus);
		this.setStartStep(startStep);
		this.setEndStep(endStep);
		this.setPrevWorkflowSteps(prevWorkflowSteps);
	}
	
	@Override
	public String toString() {
		return workflowStatus.toString();
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public WorkflowStatus getWorkflowStatus() {
		return workflowStatus;
	}
	public void setWorkflowStatus(WorkflowStatus workflowStatus) {
		this.workflowStatus = workflowStatus;
	}
	public boolean isStartStep() {
		return startStep;
	}
	public void setStartStep(boolean startStep) {
		this.startStep = startStep;
	}
	public boolean isEndStep() {
		return endStep;
	}
	public void setEndStep(boolean endStep) {
		this.endStep = endStep;
	}
	public List<WorkflowStep> getNextWorkflowSteps() {
		return nextWorkflowSteps;
	}
	public void setNextWorkflowSteps(List<WorkflowStep> nextWorkflowSteps) {
		this.nextWorkflowSteps = nextWorkflowSteps;
	}
	public WorkflowStep getPrevWorkflowSteps() {
		return prevWorkflowSteps;
	}
	public void setPrevWorkflowSteps(WorkflowStep prevWorkflowSteps) {
		this.prevWorkflowSteps = prevWorkflowSteps;
	}
}
