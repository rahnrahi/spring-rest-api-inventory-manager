package in.rahi.rest.expense.rahirestexpense.entity;

import java.util.UUID;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "exp_employee")
public class Employee extends BaseEnitity{
    @Id
    @GeneratedValue
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private UUID EmpId;

    @JsonProperty("full_name")
    @NotBlank(message = "Name is mandatory")
    private String Name;

    private String Age;

    private String Location;

    @NotBlank(message = "Email is mandatory")
    private String Email;

    private String Department;

}
