package Kinn.College.coupnsys.repositories;

import Kinn.College.coupnsys.entities.Category;
import Kinn.College.coupnsys.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
