package ar.com.cdt.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import ar.com.cdt.entities.Roles;
import ar.com.cdt.entities.Skills;
import ar.com.cdt.repository.RolesRepository;
import ar.com.cdt.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	RolesRepository rolesRepository;

	@Override
	public Iterable<Roles> getRoles() {
		return rolesRepository.findAll();
	}

	@Override
	public Optional<Roles> getRolesByID(String id) {
		return rolesRepository.findById(id);
	}

	@Override
	public ResponseEntity<?> saveRoles(Roles roles) {
		try {
			Roles save = rolesRepository.save(roles);
			return ResponseEntity.ok(save);
		} catch (Exception e) {
			return (ResponseEntity<?>) ResponseEntity.internalServerError();
		}
	}

	@Override
	public ResponseEntity<?> deleteRoles(String id) {
		Optional<Roles> rolesToDelete = rolesRepository.findById(id);
		try {
			rolesRepository.delete(rolesToDelete.get());
			return ResponseEntity.ok(rolesToDelete.get());
		} catch (Exception e) {
			return (ResponseEntity<?>) ResponseEntity.internalServerError();
		}
	}
}