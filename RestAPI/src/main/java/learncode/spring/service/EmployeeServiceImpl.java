package learncode.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import learncode.spring.model.Employee;
import learncode.spring.reponsitory.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public Employee save(Employee entity) {
		return employeeRepository.save(entity);
	}

	@Override
	public List<Employee> saveAll(List<Employee> entities) {
		return (List<Employee>)employeeRepository.saveAll(entities);
	}

	@Override
	public Optional<Employee> findById(Long id) {
		return employeeRepository.findById(id);
	}

	@Override
	public boolean existsById(Long id) {
		return employeeRepository.existsById(id);
	}

	@Override
	public List<Employee> findAll() {
		return (List<Employee>)employeeRepository.findAll();
	}

	@Override
	public List<Employee> findAllById(List<Long> ids) {
		return (List<Employee>)employeeRepository.findAllById(ids);
	}

	@Override
	public long count() {
		return employeeRepository.count();
	}

	@Override
	public void deleteById(Long id) {
		employeeRepository.deleteById(id);
	}

	@Override
	public void delete(Employee entity) {
		employeeRepository.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		employeeRepository.deleteAllById(ids);
	}

	@Override
	public void deleteAll(List<Employee> entities) {
		employeeRepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		employeeRepository.deleteAll();
	}
	
}
