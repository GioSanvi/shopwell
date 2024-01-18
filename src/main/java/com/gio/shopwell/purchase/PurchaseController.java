package com.gio.shopwell.purchase;
import com.gio.shopwell.customer.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.gio.shopwell.customer.CustomerRepository;

@RestController
@RequestMapping(path = "api/purchases")
public class PurchaseController {

    private final PurchaseService purchaseService;

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    public PurchaseController(PurchaseService purchaseService){
        this.purchaseService = purchaseService;
    }

    @GetMapping
    public List<Purchase> getAllPurchases(){
        return purchaseService.getPurchases();
    }

    @PostMapping
    public void addNewPurchase(@RequestBody Customer purchase){
        customerRepository.save(purchase);
//        purchaseService.addNewPurchase(purchase);
        System.out.println("Added Purchase");
    }
}
