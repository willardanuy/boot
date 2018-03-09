package br.com.express.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.express.repositories.UserRepository;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;

	@Override
	public Optional<br.com.express.model.User> findById(Long id) {
		return userRepository.findById(id);
	}

	@Override
	public br.com.express.model.User findByName(String name) {
		return userRepository.findByName(name);
	}

	@Override
	public void saveUser(br.com.express.model.User user) {
		userRepository.save(user);
		
	}

	@Override
	public void updateUser(br.com.express.model.User user) {
		saveUser(user);
	}

	@Override
	public void deleteUserById(Long id) {
		userRepository.deleteById(id);
	}

	@Override
	public void deleteAllUsers() {
		userRepository.deleteAll();
		
	}

	@Override
	public List<br.com.express.model.User> findAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public boolean isUserExist(br.com.express.model.User user) {
		return findByName(user.getName()) != null;
	}

	
}
