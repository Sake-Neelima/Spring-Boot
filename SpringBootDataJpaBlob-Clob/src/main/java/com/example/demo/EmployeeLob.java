package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Column;
import lombok.Data;

@Entity
@Data
public class EmployeeLob {
    @Id
    private Integer id;
    private String name;
    
    @Lob
    @Column(length = 1000000) // Example length, adjust as needed
    private byte[] img;
    
    @Lob
    private char[] description;
}
