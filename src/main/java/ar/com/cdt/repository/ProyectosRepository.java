package ar.com.cdt.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import ar.com.cdt.entities.Proyectos;

public interface ProyectosRepository extends ElasticsearchRepository<Proyectos, String> {

	Proyectos findByDescripcion(String descripcion);
}