package fr.olivex.invader.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.olivex.invader.entities.Invader;
import fr.olivex.invader.repositories.InvaderRepository;

@RestController
public class InvaderController {
    @Autowired
    private InvaderRepository invaderRepository;
    
    @GetMapping("/invaders")
    public Iterable<Invader> invader(@RequestParam(value = "location", defaultValue = "Paris") String location) {
        return invaderRepository.findAll();
    }
}
