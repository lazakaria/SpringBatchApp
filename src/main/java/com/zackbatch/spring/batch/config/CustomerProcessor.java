package com.zackbatch.spring.batch.config;

import com.zackbatch.spring.batch.entity.Customer;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customer, Customer> {

    @Override
    public Customer process(Customer customer) throws Exception {
        if (customer.getCountry().equals("United States")) {
            customer.setFirstName(customer.getFirstName().toUpperCase());
            customer.setLastName(customer.getLastName().toUpperCase());
            return customer;
        } else {
            return null;
        }
    }
}
