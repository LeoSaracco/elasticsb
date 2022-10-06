package ar.com.cdt.service;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import ar.com.cdt.entities.Skills;

@Service
public interface SkillService {

	Iterable<Skills> getSkills();

	Optional<Skills> getSkillByID(String id);
	
	ResponseEntity<?> saveSkill(Skills skill);
	
	ResponseEntity<?> deleteSkill(String id);
}