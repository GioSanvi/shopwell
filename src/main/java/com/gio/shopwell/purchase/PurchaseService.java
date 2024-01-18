package com.gio.shopwell.purchase;

import com.gio.shopwell.customer.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseService {
    private final PurchaseRepository purchaseRepository;

//    @Autowired
//    private CustomerRepository customerRepository;

    @Autowired
    public PurchaseService(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }

    public List<Purchase> getPurchases(){
        return purchaseRepository.findAll();
    }

//    public void addNewPurchase(Purchase purchase){
//        customerRepository.findAllById(purchase.getCustomer())
//        purchaseRepository.save(purchase);
//    }


}
