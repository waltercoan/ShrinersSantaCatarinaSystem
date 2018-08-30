package br.univille.ShrinersSantaCatarinaSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.ShrinersSantaCatarinaSystem.model.RequestForTreatment;
import br.univille.ShrinersSantaCatarinaSystem.model.StatusRequestChangeRegistry;

@Repository
public interface StatusRequestChangeRegistryRepository extends JpaRepository<StatusRequestChangeRegistry, Long>{
	public List<StatusRequestChangeRegistry> findByrequest(RequestForTreatment request);
}
