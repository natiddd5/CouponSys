package Kinn.College.coupnsys.repositories;

import Kinn.College.coupnsys.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
