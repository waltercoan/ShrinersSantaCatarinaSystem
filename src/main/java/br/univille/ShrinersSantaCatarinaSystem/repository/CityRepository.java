package br.univille.ShrinersSantaCatarinaSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.ShrinersSantaCatarinaSystem.model.City;


@Repository
public interface CityRepository extends JpaRepository<City, Long>{

}
