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

import ar.com.cdt.entities.Skills;
import ar.com.cdt.service.SkillService;

/**
 *
 * @author lsaracco
 */

@RestController
@RequestMapping("/api/skills")
public class SkillRestController {

	@Autowired
	SkillService skillService;

	@GetMapping()
	public Iterable<Skills> list() {
		return skillService.getSkills();
	}

	@GetMapping("/{id}")
	public Optional<Skills> get(@PathVariable String id) {
		return skillService.getSkillByID(id);
	}

	@PostMapping("/save")
	public ResponseEntity<?> post(@RequestBody Skills skill) {
		return skillService.saveSkill(skill);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable String id) {
		return skillService.deleteSkill(id);
	}
}