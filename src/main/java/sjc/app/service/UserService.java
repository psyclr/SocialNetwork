package sjc.app.service;

import java.util.List;

import sjc.app.repository.entity.User;

public interface UserService {
	
	User loadUserByCredentials(String login, String password);

	User getUserByID(Long userId);

	User getUserByName(String username);
	
	List<User> getAllUsers();
}
