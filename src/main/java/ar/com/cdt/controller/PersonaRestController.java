package ar.com.cdt.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.cdt.entities.Persona;
import ar.com.cdt.service.PersonaService;

/**
 *
 * @author lsaracco
 */

@RestController
@RequestMapping("/api/personas")
public class PersonaRestController {

	@Autowired
	PersonaService personaService;

	@GetMapping()
	public Iterable<Persona> list() {
		return personaService.getPersona();
	}

	@GetMapping("/{id}")
	public Optional<Persona> get(@PathVariable String id) {
		return personaService.getPersonaByID(id);
	}

	@PostMapping("/save")
	public ResponseEntity<?> post(@RequestBody Persona Persona) {
		return personaService.savePersona(Persona);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable String id) {
		return personaService.deletePersona(id);
	}
}