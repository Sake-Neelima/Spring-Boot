package com.example.demo;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CustomerRunner implements CommandLineRunner {
    @Autowired
    private CustomerRepository crepo;

    @Override
    public void run(String... args) throws Exception {
        Date dt = new Date(); // Current date and time

        // Assuming Customer constructor signature is (String name, Date dt1, Date dt2, Date dt3)
        crepo.saveAll(Arrays.asList(
                new Customer(101, "neelu", dt, dt, dt),
                new Customer(102, "nikki", dt, dt, dt),
                new Customer(103, "nimbu", dt, dt, dt),
                new Customer(104, "harish", dt, dt, dt),
                new Customer(105, "megha", dt, dt, dt),
                new Customer(106, "vamsi", dt, dt, dt)
        ));

        // Format the current date and time
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        String formattedDate = dateFormat.format(dt);
        System.out.println("Formatted Date: " + formattedDate);
    }
}
