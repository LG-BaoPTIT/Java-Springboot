package learncode.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import learncode.spring.model.User;
import learncode.spring.repository.UserRepository;

public interface UserService {

	void deleteAll();

	void deleteAll(List<User> entities);

	void deleteAllById(Iterable<? extends String> ids);

	void delete(User entity);

	void deleteById(String id);

	long count();

	List<User> findAllById(List<String> ids);

	List<User> findAll();

	boolean existsById(String id);

	Optional<User> findById(String id);

	List<User> saveAll(List<User> entities);

	User save(User entity);
	
	boolean checkLogin(String username, String password);

	List<User> findByFullNameLike(String name);
	
	User FindByUsername(String username);
}
