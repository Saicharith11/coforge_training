package com.coforge.config;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.coforge.model.Customer;
import com.coforge.model.DeliveryAddress;

@Configuration
public class BeanConfiguration {
	
	@Bean (name = "customer1")
	public Customer getDeliveryAddress() { 
		Customer customer = new Customer();
		customer.setCustomerId(101);
		customer.setCustomerName("Sai");
		customer.setEmails(Arrays.asList("sai@gmail.com" , "sss@gmail.com"));
		customer.setDeliveryAddress(Arrays.asList(getDeliveryAddress2()));
		return customer;
	}
	
	@Bean (name = "deliveryAddress2")
	public DeliveryAddress getDeliveryAddress2() {
		DeliveryAddress deliveryAddress1 = new DeliveryAddress();
		deliveryAddress1.setCity("City - 1");
		deliveryAddress1.setState("State - 1");
		return deliveryAddress1;
	}

	
	
}
