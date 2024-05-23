package com.example.demo;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {
    @Id
    private Integer eid;
    private String ename;
    private Double esal;
    
    @OneToMany
    @JoinColumn(name="emidfk")
    private List<Projects> pro;
}
