//package Kinn.College.CouponManagementSystem.controllers;
//
//import Kinn.College.CouponManagementSystem.entities.Company;
//import Kinn.College.CouponManagementSystem.servieces.CompanyService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class CompanyController {
//
//    @Autowired
//    private CompanyService service;
//
//    @PostMapping("/addcompany")
//    public Company addCompany(@RequestBody Company company) {
//        return service.saveCompany(company);
//    }
//
//    @PostMapping("/addcompanies")
//    public List<Company> addCompanies(@RequestBody List<Company> companies) {
//        return service.saveCompanies(companies);
//    }
//
//    @DeleteMapping("/deletecompany/{id}")
//    public void deleteCompany(@PathVariable int id) {
//        service.deleteById(id);
//    }
//
//    @GetMapping("/companies")
//    public List<Company> getAllCompanies() {
//        return service.getCompanies();
//    }
//
//    @GetMapping("/companies/{id}")
//    public Company getCompanyById(@PathVariable int id) {
//        return service.getById(id);
//    }
//}
