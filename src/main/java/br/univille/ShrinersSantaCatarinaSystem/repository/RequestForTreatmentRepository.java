package br.univille.ShrinersSantaCatarinaSystem.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.ShrinersSantaCatarinaSystem.model.RequestForTreatment;


@Repository
public interface RequestForTreatmentRepository extends JpaRepository<RequestForTreatment, Long>{

}