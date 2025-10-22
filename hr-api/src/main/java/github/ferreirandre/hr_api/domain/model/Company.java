package github.ferreirandre.hr_api.domain.model;

import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;

@Table
@Data(staticConstructor = "of")
public class Company {
    private long id;
    private String name;
    private List<PayCheck> salaries;
    private List<Employee> employees;
}
