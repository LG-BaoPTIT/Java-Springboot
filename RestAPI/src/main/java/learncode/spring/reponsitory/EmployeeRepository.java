package learncode.spring.reponsitory;

import org.springframework.data.repository.CrudRepository;
import learncode.spring.model.*;
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
