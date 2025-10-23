package github.ferreirandre.hr_api.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Table
@Data(staticConstructor = "of")
@Entity
@Builder
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PayCheck> payCheckList;

    @ManyToOne
    @JoinColumn(name = "company_id", nullable = false)
    private Company company;
}
