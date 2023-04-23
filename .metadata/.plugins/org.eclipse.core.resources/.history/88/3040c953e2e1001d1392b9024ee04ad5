package learncode.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import learncode.spring.model.User;

@SpringBootApplication
public class Session01CrudNoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(Session01CrudNoDbApplication.class, args);
	}
	
	@Bean(name="USER_BEAN")
	public User setUser() {
		User u = new User();
		u.setUserName("admin");
		u.setPassWord("admin123");
		return u;
	}
}
