package com.gio.shopwell.purchase;

import com.gio.shopwell.customer.Customer;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Purchase {
    @Id
    @SequenceGenerator(
            name = "purchase_sequence",
            sequenceName = "purchase_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy= GenerationType.SEQUENCE,
            generator = "purchase_sequence"
    )

    private Long purchaseId;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    private double purchaseAmount;
    private LocalDate purchaseDate;

    public Purchase(){}
    public Purchase(Long purchaseId, Customer customer, double purchaseAmount, LocalDate purchaseDate) {
        this.purchaseId = purchaseId;
        this.customer = customer;
        this.purchaseAmount = purchaseAmount;
        this.purchaseDate = purchaseDate;
    }

    public Long getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Long purchaseId) {
        this.purchaseId = purchaseId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(double purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
}
