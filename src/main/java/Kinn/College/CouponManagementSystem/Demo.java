package Kinn.College.CouponManagementSystem;

import Kinn.College.CouponManagementSystem.entities.Company;
import Kinn.College.CouponManagementSystem.entities.Coupon;
import Kinn.College.CouponManagementSystem.servieces.CompanyService;
import Kinn.College.CouponManagementSystem.servieces.CouponService;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class Demo {

    private final CompanyService companyService;
    private final CouponService couponService;

    public Demo(CompanyService companyService, CouponService couponService) {
        this.companyService = companyService;
        this.couponService = couponService;
    }

    @PostConstruct
    void init() {
        System.out.println("Testing the service methods:");
        Company company = companyService.getCompanyByEmailAndPassword("Elon@tes.com", "TechnoKing123");
        System.out.println("Got company by email and password: " + company);
        
//       createCompaniesAndCoupons();
//       testCompaniesAndCoupons();
    }

    private void createCompaniesAndCoupons() {
        Company company1 = new Company();
        company1.setName("Tesla");
        company1.setEmail("Elon@tes.com");
        company1.setPassword("TechnoKing123");
        companyService.addCompany(company1);
        System.out.println("Added new company: " + company1);

        Company company2 = new Company();
        company2.setName("SpaceX");
        company2.setEmail("elon@space.com");
        company2.setPassword("MarsKing123");
        companyService.addCompany(company2);
        System.out.println("Added new company: " + company2);

        Company company3 = new Company();
        company3.setName("The Boring Company");
        company3.setEmail("elon@boring.com");
        company3.setPassword("TunnelKing123");
        companyService.addCompany(company3);
        System.out.println("Added new company: " + company3);

        List<Company> companies = new ArrayList<>();
        companies.add(company1);
        companies.add(company2);
        companies.add(company3);

        Coupon coupon1 = new Coupon();
        coupon1.setTitle("Tesla Model S Discount");
        coupon1.setCompany(company1);
        couponService.addCoupon(coupon1);

        Coupon coupon2 = new Coupon();
        coupon1.setTitle("Tesla Model XR Discount");
        coupon1.setCompany(company2);
        couponService.addCoupon(coupon2);

        Coupon coupon3 = new Coupon();
        coupon1.setTitle("SpaceX tripToMars discount");
        coupon1.setCompany(company2);
        couponService.addCoupon(coupon2);
    }

    private void testCompaniesAndCoupons() {

// Test getting a company by email and password
//
        //        // Test getting a company by id
//        company = companyService.getCompanyById(1);
//        System.out.println("Got company by id: " + company);
//
//        // Test deleting a company
//        companyService.deleteCompany(2);
//        System.out.println("Deleted company with id 2");
//
//        // Test updating a company
//        company = companyService.getCompanyById(1);
//        company.setName("Updated Company");
//        companyService.updateCompany(company);
//        System.out.println("Updated company: " + company);
//
//        // Test getting all companies
//        List<Company> companies = companyService.getAllCompanies();
//        System.out.println("All companies: " + companies);

        // Test getting a coupon by id
//        Coupon coupon = couponService.getCouponById(1);
//        System.out.println("Got coupon by id: " + coupon);
//
//        // Test getting all coupons
//        List<Coupon> coupons = couponService.getAllCoupons();
//        System.out.println("All coupons: " + coupons);

    }

}