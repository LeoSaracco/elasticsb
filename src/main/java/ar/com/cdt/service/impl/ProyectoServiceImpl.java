package ar.com.cdt.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import ar.com.cdt.entities.Proyectos;
import ar.com.cdt.repository.ProyectosRepository;
import ar.com.cdt.service.ProyectoService;

@Service
public class ProyectoServiceImpl implements ProyectoService {

	@Autowired
	ProyectosRepository proyectosRepository;

	@Override
	public Iterable<Proyectos> getProyectos() {
		return proyectosRepository.findAll();
	}

	@Override
	public Optional<Proyectos> getProyectosByID(String id) {
		return proyectosRepository.findById(id);
	}

	@Override
	public ResponseEntity<?> saveProyectos(Proyectos proyectos) {
		try {
			Proyectos save = proyectosRepository.save(proyectos);
			return ResponseEntity.ok(save);
		} catch (Exception e) {
			return (ResponseEntity<?>) ResponseEntity.internalServerError();
		}
	}

	@Override
	public ResponseEntity<?> deleteProyectos(String id) {
		Optional<Proyectos> proyectosToDelete = proyectosRepository.findById(id);
		try {
			proyectosRepository.delete(proyectosToDelete.get());
			return ResponseEntity.ok(proyectosToDelete.get());
		} catch (Exception e) {
			return (ResponseEntity<?>) ResponseEntity.internalServerError();
		}
	}
}