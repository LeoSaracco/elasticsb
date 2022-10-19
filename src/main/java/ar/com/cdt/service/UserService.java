package ar.com.cdt.service;

import org.springframework.stereotype.Service;

import ar.com.cdt.entities.User;

@Service
public interface UserService {

	Boolean getUser(User user);
}