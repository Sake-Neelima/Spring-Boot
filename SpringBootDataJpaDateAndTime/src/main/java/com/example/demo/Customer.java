package com.example.demo;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
	@Id
	private Integer cid;
	private String cname;
	@Temporal(TemporalType.DATE)
	private Date dtea;
	@Temporal(TemporalType.TIME)
	private Date dteb;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtec;
}
