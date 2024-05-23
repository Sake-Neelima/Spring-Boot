package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Profile {
	@Id
    private Integer profileId;
    private String profileType;
    private String profileDescription;
 
}
