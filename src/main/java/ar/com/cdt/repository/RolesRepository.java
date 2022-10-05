package ar.com.cdt.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import ar.com.cdt.entities.Roles;

public interface RolesRepository extends ElasticsearchRepository<Roles, String> {
}