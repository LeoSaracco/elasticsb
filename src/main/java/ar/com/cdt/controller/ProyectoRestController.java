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

import ar.com.cdt.entities.Proyectos;
import ar.com.cdt.service.ProyectoService;

/**
 *
 * @author lsaracco
 */

@RestController
@RequestMapping("/api/proyectos")
public class ProyectoRestController {

	@Autowired
	ProyectoService proyectosService;

	@GetMapping()
	public Iterable<Proyectos> list() {
		return proyectosService.getProyectos();
	}

	@GetMapping("/{id}")
	public Optional<Proyectos> get(@PathVariable String id) {
		return proyectosService.getProyectosByID(id);
	}

	@PostMapping("/save")
	public ResponseEntity<?> post(@RequestBody Proyectos proyectos) {
		return proyectosService.saveProyectos(proyectos);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable String id) {
		return proyectosService.deleteProyectos(id);
	}
}