package ar.com.cdt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.cdt.entities.User;
import ar.com.cdt.service.UserService;

/**
 *
 * @author lsaracco
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/users")
public class UserRestController {

	@Autowired
	UserService userService;

	@PostMapping("/auth")
	public Boolean post(@RequestBody User user) {
		return userService.getUser(user);
	}
}