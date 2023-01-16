package Kinn.College.CouponManagementSystem.servieces;

import Kinn.College.CouponManagementSystem.entities.Coupon;
import Kinn.College.CouponManagementSystem.repositories.CouponRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CouponService {
    private final CouponRepository couponRepository;

    public CouponService(CouponRepository couponRepository) {
        this.couponRepository = couponRepository;
    }

    public Coupon getCouponById(int id) {
        return couponRepository.findById(id).orElse(null);
    }

    public List<Coupon> getAllCoupons() {
        return couponRepository.findAll();
    }

    public List<Coupon> getCouponsByCompany(int companyId) {
        return couponRepository.findByCompanyId(companyId);
    }

    public void addCoupon(Coupon coupon) {
        couponRepository.save(coupon);
    }

    public void deleteCoupon(int id) {
        couponRepository.deleteById(id);
    }

    public void updateCoupon(Coupon coupon) {
        couponRepository.save(coupon);
    }
}
