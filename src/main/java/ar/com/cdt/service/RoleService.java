package ar.com.cdt.service;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import ar.com.cdt.entities.Roles;

@Service
public interface RoleService {

	Iterable<Roles> getRoles();

	Optional<Roles> getRolesByID(String id);
	
	ResponseEntity<?> saveRoles(Roles roles);
	
	ResponseEntity<?> deleteRoles(String id);
}