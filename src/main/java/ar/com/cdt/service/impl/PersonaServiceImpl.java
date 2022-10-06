package ar.com.cdt.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import ar.com.cdt.entities.Persona;
import ar.com.cdt.repository.PersonaRepository;
import ar.com.cdt.service.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService {

	@Autowired
	PersonaRepository personaRepository;

	@Override
	public Iterable<Persona> getPersona() {
		return personaRepository.findAll();
	}

	@Override
	public Optional<Persona> getPersonaByID(String id) {
		return personaRepository.findById(id);
	}

	@Override
	public ResponseEntity<?> savePersona(Persona Persona) {
		try {
			Persona save = personaRepository.save(Persona);
			return ResponseEntity.ok(save);
		} catch (Exception e) {
			return (ResponseEntity<?>) ResponseEntity.internalServerError();
		}
	}

	@Override
	public ResponseEntity<?> deletePersona(String id) {
		Optional<Persona> personaToDelete = personaRepository.findById(id);
		try {
			personaRepository.delete(personaToDelete.get());
			return ResponseEntity.ok(personaToDelete.get());
		} catch (Exception e) {
			return (ResponseEntity<?>) ResponseEntity.internalServerError();
		}
	}
}