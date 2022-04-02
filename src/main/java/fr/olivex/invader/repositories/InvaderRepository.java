package fr.olivex.invader.repositories;

import org.springframework.data.repository.CrudRepository;

import fr.olivex.invader.entities.Invader;

public interface InvaderRepository extends CrudRepository<Invader, Long> {
    Invader findByName(String name);
}
