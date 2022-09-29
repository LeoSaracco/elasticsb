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

import ar.com.cdt.entities.Roles;
import ar.com.cdt.service.RoleService;

/**
 *
 * @author lsaracco
 */

@RestController
@RequestMapping("/api/roles")
public class RolesRestController {

	@Autowired
	RoleService rolesService;

	@GetMapping()
	public Iterable<Roles> list() {
		return rolesService.getRoles();
	}

	@GetMapping("/{id}")
	public Optional<Roles> get(@PathVariable String id) {
		return rolesService.getRolesByID(id);
	}

	@PostMapping("/save")
	public ResponseEntity<?> post(@RequestBody Roles roles) {
		return rolesService.saveRoles(roles);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable String id) {
		return rolesService.deleteRoles(id);
	}
}