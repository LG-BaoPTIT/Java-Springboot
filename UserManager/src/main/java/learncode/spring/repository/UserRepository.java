package learncode.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import learncode.spring.model.User;

public interface UserRepository extends CrudRepository<User, String> {
	List<User> findByFullNameLike(String name);
	@Query("select u from User u where u.userName = ?1")
	User FindByUsername(String username);
}
