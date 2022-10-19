package ar.com.cdt.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import ar.com.cdt.entities.User;

public interface UserRepository extends ElasticsearchRepository<User, String> {

	User findByEmail(String email);
}