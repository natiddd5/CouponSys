package Kinn.College.CouponManagementSystem.repositories;

import Kinn.College.CouponManagementSystem.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Integer> {
    Company findByEmailAndPassword(String email, String password);
}
