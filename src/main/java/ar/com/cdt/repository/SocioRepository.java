package ar.com.cdt.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import ar.com.cdt.entities.Socio;

public interface SocioRepository extends ElasticsearchRepository<Socio, String> {
}