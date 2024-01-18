package com.gio.shopwell.customer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration

public class CustomerConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            CustomerRepository repository){
        return args ->{

            Customer gio = new Customer(
                    "Gio",
                    "gio@gmail.com",
                    0,
                    0,
                    false,
                    0
            );

            Customer vito = new Customer(
                    "Vito",
                    "vito@hotmail.com",
                    0,
                    0,
                    false,
                    0
            );

            repository.saveAll(
                    List.of(gio,vito)
            );
        };
    }
}
