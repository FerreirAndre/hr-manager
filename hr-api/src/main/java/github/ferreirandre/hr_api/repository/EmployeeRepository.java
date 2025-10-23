package github.ferreirandre.hr_api.repository;

import github.ferreirandre.hr_api.model.Company;
import github.ferreirandre.hr_api.model.Employee;
import github.ferreirandre.hr_api.model.PayCheck;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<PayCheck> findAllPayChecksByEmployee(Employee employee);
    List<Employee> findByCompany(Company company);
}
