package Kinn.College.CouponManagementSystem.repositories;

import Kinn.College.CouponManagementSystem.entities.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CouponRepository extends JpaRepository<Coupon, Integer> {
    Coupon findByTitle(String title);

    List<Coupon> findByCompanyId(int companyId);
}
