package Kinn.College.coupnsys;

import Kinn.College.coupnsys.entities.Category;
import Kinn.College.coupnsys.entities.Company;
import Kinn.College.coupnsys.entities.Coupon;
import Kinn.College.coupnsys.servieces.CategoryService;
import Kinn.College.coupnsys.servieces.CompanyService;
import Kinn.College.coupnsys.servieces.CouponService;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.time.LocalDate;


@Component
public class Demo {

    private final CompanyService companyService;
    private final CouponService couponService;

    private final CategoryService categoryService;

    public Demo(CompanyService companyService, CouponService couponService, CategoryService categoryService) {
        this.companyService = companyService;
        this.couponService = couponService;
        this.categoryService = categoryService;
    }

    @PostConstruct
    void init() {
//        System.out.println("Testing the service methods:");
//        Company company = companyService.getCompanyByEmailAndPassword("Elon@tes.com", "TechnoKing123");
//        System.out.println("Got company by email and password: " + company);

       CreateEntities();
//       testCompaniesAndCoupons();
    }

    private void CreateEntities() {
//        companyService.addCompany(new Company("Tesla", "tesla@email.com", "password1"));
//        companyService.addCompany(new Company("Boring Company", "boring@email.com", "password2"));
//        companyService.addCompany(new Company("SpaceX", "spacex@email.com", "password3"));
//        companyService.addCompany(new Company("Neuralink", "neuralink@email.com", "password4"));
//        companyService.addCompany(new Company("The Boring Company", "theboring@email.com", "password5"));

//        categoryService.addCategory(new Category("Science"));
//        categoryService.addCategory(new Category("Space"));
//        categoryService.addCategory(new Category("Food"));
//        categoryService.addCategory(new Category("Cars"));
//        categoryService.addCategory(new Category("Weapons"));
//        categoryService.addCategory(new Category("Artillery"));
//        categoryService.addCategory(new Category("Electronics"));
//        categoryService.addCategory(new Category("Cartridges"));
//        categoryService.addCategory(new Category("Medical Equipment"));


//        Coupon coupon = new Coupon();
//        coupon.setCompany(companyService.getCompanyById(2));
//        coupon.setCategory(categoryService.getCategoryById(2));
//        coupon.setTitle("Model S discount");
//        coupon.setDescription("25% discount on model X");
//        coupon.setStartDate(LocalDate.now());
//        coupon.setEndDate(LocalDate.of(2024,10,15));
//        coupon.setImage("YyYyYyModelYyYyYy");
//        coupon.setPrice(1000D);
//        coupon.setAmount(1);
//        couponService.addCoupon(coupon);

        var company = companyService.getCompanyById(1);
        System.out.println(company.toString());




    }


}