package learncode.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import learncode.spring.model.Employee;
import learncode.spring.reponsitory.EmployeeRepository;

public interface EmployeeService {

	void deleteAll();

	void deleteAll(List<Employee> entities);

	void deleteAllById(Iterable<? extends Long> ids);

	void delete(Employee entity);

	void deleteById(Long id);

	long count();

	List<Employee> findAllById(List<Long> ids);

	List<Employee> findAll();

	boolean existsById(Long id);

	Optional<Employee> findById(Long id);

	List<Employee> saveAll(List<Employee> entities);

	Employee save(Employee entity);


	
}
