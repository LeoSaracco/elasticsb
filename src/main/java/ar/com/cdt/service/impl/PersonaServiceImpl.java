package ar.com.cdt.service.impl;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import ar.com.cdt.entities.Persona;
import ar.com.cdt.entities.Proyectos;
import ar.com.cdt.repository.PersonaRepository;
import ar.com.cdt.service.PersonaService;
import ar.com.cdt.service.ProyectoService;

@Service
public class PersonaServiceImpl implements PersonaService {

	@Autowired
	PersonaRepository personaRepository;

	@Autowired
	ProyectoService proyectoService;

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
			for (int i = 0; i < save.getProyectos().size(); i++) {
				System.out.println("Proyecto " + save.getProyectos().get(i).getDescripcion());
				try {
					Boolean existe = false;
					Proyectos proyecto = proyectoService
							.getProyectosByDescripcion(save.getProyectos().get(i).getDescripcion());
					ArrayList<String> listaEmpleados = proyecto.getEmpleados();
					for (int j = 0; j < listaEmpleados.size(); j++) {
						if (listaEmpleados.get(j).equals(Persona.getNombre() + " " + Persona.getApellido())) {
							existe = true;
							break;
						}
					}
					if (!existe) {
						listaEmpleados.add(Persona.getNombre() + " " + Persona.getApellido());
						proyecto.setEmpleados(listaEmpleados);
					}
					proyectoService.saveProyectos(proyecto);
				} catch (Exception s) {
					continue;
				}

			}
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