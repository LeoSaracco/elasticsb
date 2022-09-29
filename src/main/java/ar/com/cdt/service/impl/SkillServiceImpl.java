package ar.com.cdt.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import ar.com.cdt.entities.Skills;
import ar.com.cdt.repository.SkillsRepository;
import ar.com.cdt.service.SkillService;

@Service
public class SkillServiceImpl implements SkillService {

	@Autowired
	SkillsRepository skillsRepository;

	@Override
	public Iterable<Skills> getSkills() {
		return skillsRepository.findAll();
	}

	@Override
	public Optional<Skills> getSkillByID(String id) {
		return skillsRepository.findById(id);
	}

	@Override
	public ResponseEntity<?> saveSkill(Skills skill) {
		try {
			Skills save = skillsRepository.save(skill);
			return ResponseEntity.ok(save);
		} catch (Exception e) {
			return (ResponseEntity<?>) ResponseEntity.internalServerError();
		}
	}

	@Override
	public ResponseEntity<?> deleteSkill(String id) {
		Optional<Skills> skillsToDelete = skillsRepository.findById(id);
		try {
			skillsRepository.delete(skillsToDelete.get());
			return ResponseEntity.ok(skillsToDelete.get());
		} catch (Exception e) {
			return (ResponseEntity<?>) ResponseEntity.internalServerError();
		}
	}
}