package br.univille.ShrinersSantaCatarinaSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.univille.ShrinersSantaCatarinaSystem.model.WorkflowStatus;
import br.univille.ShrinersSantaCatarinaSystem.model.WorkflowStep;

public interface WorkflowStepRepository  extends JpaRepository<WorkflowStep, Long>{

	List<WorkflowStep> findByworkflowStatus(WorkflowStatus newrequest);

}
