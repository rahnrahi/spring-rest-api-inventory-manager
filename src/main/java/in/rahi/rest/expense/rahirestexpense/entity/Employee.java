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
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "inv_employee")
@Data
@EqualsAndHashCode(callSuper=false, of = "empId")
public class Employee extends BaseEnitity{
    @Id
    @GeneratedValue
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private UUID empId;

    @JsonProperty("full_name")
    @NotBlank(message = "Name is mandatory")
    private String name;

    private String age;

    private String location;

    @NotBlank(message = "Email is mandatory")
    private String email;

    private String department;

}
