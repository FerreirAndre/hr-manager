package github.ferreirandre.hr_api.repository;

import github.ferreirandre.hr_api.model.Employee;
import github.ferreirandre.hr_api.model.PayCheck;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PayCheckRepository extends JpaRepository<PayCheck, Long> {
    List<PayCheck> findByEmployee(Employee employee);
}
