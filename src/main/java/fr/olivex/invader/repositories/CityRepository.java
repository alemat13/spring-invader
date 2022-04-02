package fr.olivex.invader.repositories;

import org.springframework.data.repository.CrudRepository;

import fr.olivex.invader.entities.City;

public interface CityRepository extends CrudRepository<City, Long> {
    City findByName(String name);
}
