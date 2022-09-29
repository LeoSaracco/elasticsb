package ar.com.cdt.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import ar.com.cdt.entities.Skills;

public interface SkillsRepository extends ElasticsearchRepository<Skills, String> {
}