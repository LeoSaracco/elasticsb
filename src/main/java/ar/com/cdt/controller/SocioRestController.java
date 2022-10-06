package ar.com.cdt.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.cdt.entities.Socio;
import ar.com.cdt.service.SocioService;

/**
 *
 * @author lsaracco
 */

@RestController
@RequestMapping("/socios")
public class SocioRestController {

	@Autowired
	SocioService socioService;

	@GetMapping()
	public Iterable<Socio> list() {
		return socioService.getSocios();
	}

	@GetMapping("/{id}")
	public Optional<Socio> get(@PathVariable String id) {
		return socioService.getSocioByID(id);
	}

	@PutMapping()
	public ResponseEntity<?> put(@RequestBody Socio socio) {
		return socioService.updateSocio(socio);
	}

	@PostMapping
	public ResponseEntity<?> post(@RequestBody Socio socio) {
		return socioService.saveSocio(socio);
	}

//	@DeleteMapping("/{id}")
//	public ResponseEntity<?> delete(@PathVariable Long id) {
//		return socioService.deleteSocio(id);
//	}
}