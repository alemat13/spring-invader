package fr.olivex.invader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fr.olivex.invader.entities.City;
import fr.olivex.invader.entities.Invader;
import fr.olivex.invader.repositories.CityRepository;
import fr.olivex.invader.repositories.InvaderRepository;

@SpringBootApplication
public class InvaderApplication {
	private static final Logger log = LoggerFactory.getLogger(InvaderApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(InvaderApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(InvaderRepository invaderRepository, CityRepository cityRepository) {
		return (args) -> {
			City paris = new City("Paris", "PA");
			cityRepository.save(paris);
			City versailles = new City("Versailles", "VRS");
			cityRepository.save(versailles);

			Invader pa01 = new Invader("PA_01");
			pa01.setCity(paris);
			pa01.setStatus((byte)0);
			pa01.setPoints((byte)10);
			invaderRepository.save(pa01);

			Invader pa02 = new Invader("PA_02");
			pa02.setCity(paris);
			pa02.setStatus((byte)4);
			pa02.setPoints((byte)20);
			invaderRepository.save(pa02);

			Invader vrs01 = new Invader("VRS_01");
			vrs01.setCity(versailles);
			vrs01.setStatus((byte)4);
			vrs01.setPoints((byte)10);
			invaderRepository.save(vrs01);

			Invader vrs02 = new Invader("VRS_02");
			vrs02.setCity(versailles);
			vrs02.setStatus((byte)5);
			vrs02.setPoints((byte)100);
			invaderRepository.save(vrs02);

			log.info("Invader list");
			invaderRepository.findAll().forEach(i -> log.info(toString()));
			
		};
	}
}
