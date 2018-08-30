package br.univille.ShrinersSantaCatarinaSystem.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.univille.ShrinersSantaCatarinaSystem.model.RequestForTreatment;


@Repository
public interface RequestForTreatmentRepository extends JpaRepository<RequestForTreatment, Long>{
	@Query("select r from RequestForTreatment as r where r.canceled = false order by r.requestDate desc")
	public List<RequestForTreatment> findAllByOrder();
}