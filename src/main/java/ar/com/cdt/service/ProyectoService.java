package ar.com.cdt.service;

import java.text.ParseException;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import ar.com.cdt.entities.Proyectos;

@Service
public interface ProyectoService {

	Iterable<Proyectos> getProyectos();

	Optional<Proyectos> getProyectosByID(String id);
	
	ResponseEntity<?> saveProyectos(Proyectos proyectos);
	
	ResponseEntity<?> deleteProyectos(String id);
	
	Boolean checkProyectosDates() throws ParseException;
}