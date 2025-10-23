package github.ferreirandre.hr_api.repository;

import github.ferreirandre.hr_api.model.Company;
import github.ferreirandre.hr_api.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
