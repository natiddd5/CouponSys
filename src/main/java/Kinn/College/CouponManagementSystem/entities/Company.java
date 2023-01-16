package Kinn.College.CouponManagementSystem.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table (name = "companies")
public class Company {
    @Id
    @GeneratedValue (strategy =  GenerationType.IDENTITY)
    @Column (name = "company_id")
    private int id; // id of the company
    @Column (name = "company_name")
    private String name; // name of the company
    @Column (name = "company_email")
    private String email; // email of the company
    @Column (name = "company_password")
    private String password; // password of the company

    @OneToMany(mappedBy = "company",
            cascade = CascadeType.ALL)
    private List<Coupon> coupons = new ArrayList<>();


}
