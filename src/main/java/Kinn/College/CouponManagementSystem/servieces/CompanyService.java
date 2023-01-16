package Kinn.College.CouponManagementSystem.servieces;

import Kinn.College.CouponManagementSystem.entities.Company;
import Kinn.College.CouponManagementSystem.repositories.CompanyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {
    private final CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public Company getCompanyByEmailAndPassword(String email, String password) {
        return companyRepository.findByEmailAndPassword(email, password);
    }

    public Company getCompanyById(int id) {
        return companyRepository.findById(id).orElse(null);
    }

    public void addCompany(Company company) {
        companyRepository.save(company);
    }

    public void deleteCompany(int id) {
        companyRepository.deleteById(id);
    }

    public void updateCompany(Company company) {
        companyRepository.save(company);
    }

    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }
}
