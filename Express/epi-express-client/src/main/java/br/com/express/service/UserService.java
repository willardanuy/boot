package br.com.express.service;



import java.util.List;
import java.util.Optional;

import br.com.express.model.User;

public interface UserService {
	
	Optional<br.com.express.model.User> findById(Long id);

	User findByName(String name);

	void saveUser(User user);

	void updateUser(User user);

	void deleteUserById(Long id);

	void deleteAllUsers();

	List<User> findAllUsers();

	boolean isUserExist(User user);
}