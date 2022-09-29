package ar.com.cdt.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import ar.com.cdt.entities.Persona;

public interface PersonaRepository extends ElasticsearchRepository<Persona, String> {
}