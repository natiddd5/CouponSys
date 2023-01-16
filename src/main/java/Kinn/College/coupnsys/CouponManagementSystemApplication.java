package Kinn.College.coupnsys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CouponManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(CouponManagementSystemApplication.class, args);

	}

	// create a bean
//	@Bean
//	CommandLineRunner commandLineRunner(CompanyRepository companyRepository)
//	{
//
//
//		Company company = new Company();
//
//		return args ->
//		{
//			company.setCompany_name("TES");
//			company.setCompany_email("Elon@tes.com");
//			company.setCompany_password("TechnoKing123");
//			companyRepository.save(company);
//		};
//	}



}
