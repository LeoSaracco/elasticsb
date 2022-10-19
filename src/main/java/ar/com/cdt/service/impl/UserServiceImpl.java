package ar.com.cdt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.cdt.entities.User;
import ar.com.cdt.repository.UserRepository;
import ar.com.cdt.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public Boolean getUser(User user) {
		User result = userRepository.findByEmail(user.getEmail());
		try {
			return result.getPassword().equals(user.getPassword()) ? true : false;
		} catch (Exception e) {
			return false;
		}
	}
}