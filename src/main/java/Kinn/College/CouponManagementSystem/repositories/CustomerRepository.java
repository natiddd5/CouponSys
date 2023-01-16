package Kinn.College.CouponManagementSystem.repositories;

import Kinn.College.CouponManagementSystem.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
