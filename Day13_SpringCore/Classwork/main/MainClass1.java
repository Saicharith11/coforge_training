package com.coforge.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.model.Customer;

public class MainClass1 {
    public static void main(String[] args) {
      
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Customer customer = (Customer) context.getBean("customer1");
        System.out.println(customer);

    }
}