package Kinn.College.coupnsys.repositories;

import Kinn.College.coupnsys.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Integer> {
    Company findByEmailAndPassword(String email, String password);
}
