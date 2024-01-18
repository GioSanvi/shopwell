package com.gio.shopwell.customer;

//import com.gio.shopwell.purchase.Purchase;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Customer {
    @Id
    @SequenceGenerator(
            name = "customer_sequence",
            sequenceName = "customer_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy= GenerationType.SEQUENCE,
            generator = "customer_sequence"
    )
    private Long id;
    private String name;
    private String email;
    private int totalPoints = 0;
    private int totalPurchases = 0;
    private boolean isEligible = false;
    private double totalSpent = 0;
//    private List<Purchase> purchases;

    public Customer(Long id,
                    String name,
                    String email,
                    int totalPoints,
                    int totalPurchases,
                    boolean isEligible,
                    double totalSpent
    ) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.totalPoints = totalPoints;
        this.totalPurchases = totalPurchases;
        this.isEligible = isEligible;
        this.totalSpent = totalSpent;
    }

    public Customer(String name,
                    String email,
                    int totalPoints,
                    int totalPurchases,
                    boolean isEligible,
                    double totalSpent
                ) {
        this.name = name;
        this.email = email;
        this.totalPoints = totalPoints;
        this.totalPurchases = totalPurchases;
        this.isEligible = isEligible;
        this.totalSpent = totalSpent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public int getTotalPurchases() {
        return totalPurchases;
    }

    public void setTotalPurchases(int totalPurchases) {
        this.totalPurchases = totalPurchases;
    }

    public boolean isEligible() {
        return isEligible;
    }

    public void setEligible(boolean eligible) {
        isEligible = eligible;
    }

    public double getTotalSpent() {
        return totalSpent;
    }

    public void setTotalSpent(double totalSpent) {
        this.totalSpent = totalSpent;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", totalPoints=" + totalPoints +
                ", totalPurchases=" + totalPurchases +
                ", isEligible=" + isEligible +
                ", totalSpent=" + totalSpent +
                //", purchases=" + purchases +
                '}';
    }
}
