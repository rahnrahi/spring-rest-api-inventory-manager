package in.rahi.rest.expense.rahirestexpense.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "inv_customer")
@Data
@EqualsAndHashCode(callSuper=false, of = "customerId")
public class Customer extends BaseEnitity{

    @Id
    @GeneratedValue
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private UUID customerId;

    private String name;
    private String contactEmail;
    private String contactPhone;

}
