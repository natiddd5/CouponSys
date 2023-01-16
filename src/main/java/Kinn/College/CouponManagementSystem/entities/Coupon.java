package Kinn.College.CouponManagementSystem.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table (name = "coupons")
public class Coupon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int coupon_id;

    @ManyToOne ()
    @JoinColumn(name = "company_id")
    private Company company;
    @Column(name = "coupon_description")
    private String description;

    @Column(name = "coupon_start_date")
    private Date startDate;

    @Column(name = "coupon_end_date")
    private Date endDate;

    @Column(name = "coupon_amount")
    private int amount;

    @Column(name = "coupon_price")
    private double price;

    @Column(name = "coupon_image")
    private String image;

    @Column(name = "coupon_title")
    private String title;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
