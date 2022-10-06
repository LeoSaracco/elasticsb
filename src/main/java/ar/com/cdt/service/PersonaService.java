package ar.com.cdt.service;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import ar.com.cdt.entities.Persona;

@Service
public interface PersonaService {

	Iterable<Persona> getPersona();

	Optional<Persona> getPersonaByID(String id);
	
	ResponseEntity<?> savePersona(Persona persona);
	
	ResponseEntity<?> deletePersona(String id);
}