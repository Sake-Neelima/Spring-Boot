
package com.example.demo;

import org.springframework.lang.NonNull;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class MyRunner {
	@NonNull
	private String name;
	private Integer code;
	private Double salary;
}
