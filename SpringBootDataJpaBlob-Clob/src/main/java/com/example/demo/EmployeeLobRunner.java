package com.example.demo;

import java.io.FileInputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EmployeeLobRunner implements CommandLineRunner {
    @Autowired
    private EmployeeLobRepository elrepo;

    @Override
    public void run(String... args) throws Exception {
        FileInputStream fis = new FileInputStream("C:\\Users\\nikit\\Pictures\\Silence.jpg");
        byte[] imageBytes = fis.readAllBytes();
        fis.close();
        
        // Create an instance of EmployeeLob and set its properties
        EmployeeLob employeeLob = new EmployeeLob();
        employeeLob.setId(101);
        employeeLob.setName("neelu");
        employeeLob.setImg(imageBytes);
        employeeLob.setDescription("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa".toCharArray());

        // Save the employeeLob object
        elrepo.save(employeeLob);
    }
}
