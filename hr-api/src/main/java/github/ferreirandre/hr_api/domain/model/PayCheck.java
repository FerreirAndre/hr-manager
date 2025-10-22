package github.ferreirandre.hr_api.domain.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.YearMonth;

@Data
@Entity
@Table
public class PayCheck {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private YearMonth month;
    @Column(nullable = false)
    private BigDecimal hourlyWage;
    @Column(nullable = false)
    private Integer workedHours;
    @Column(nullable = false)
    private BigDecimal deductions;
    @Column(nullable = false)
    private BigDecimal grossSalary;
    @Column(nullable = false)
    private BigDecimal netSalary;
}
