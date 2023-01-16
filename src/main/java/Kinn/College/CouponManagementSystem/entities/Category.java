package Kinn.College.CouponManagementSystem.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "categories")

public class Category {
    @Id
    // https://stackoverflow.com/questions/20603638/what-is-the-use-of-annotations-id-and-generatedvaluestrategy-generationtype
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column (name = "category_id")
    private int id;

    @Column (name = "category_name")
    private String name;

    // https://www.baeldung.com/hibernate-one-to-many
    @OneToMany (mappedBy = "category")
    private List<Coupon> coupons;
}
