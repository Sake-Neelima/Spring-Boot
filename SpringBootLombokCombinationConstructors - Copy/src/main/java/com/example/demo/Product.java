package com.example.demo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
/*
@RequiredArgsConstructor
public class Product {
	@NonNull
	private Integer id;
	private String code;
}
*/

/*
@NoArgsConstructor
@RequiredArgsConstructor
public class Product {
	@NonNull
	private Integer id;
	private String code;
}
*/

/*
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Product {
	@NonNull
	private Integer id;
	private String code;
}
*/

/*
@NoArgsConstructor
@RequiredArgsConstructor
public class Product {

	private Integer id;
	private String code;
}
*/
/*
@NoArgsConstructor
@AllArgsConstructor
public class Product {

	
}
*/

/*
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Product {

	
}*/

/*
@RequiredArgsConstructor
@AllArgsConstructor
public class Product {
	@NonNull
	private Integer id;
	
	
}
*/
/*
@RequiredArgsConstructor
@NoArgsConstructor
public class Product {

	}

*/
/*
@Data
public class Product {
	@NonNull
	private Integer id;
	private String code;
}
*/

/*
@Data
@AllArgsConstructor
public class Product {
	@NonNull
	private Integer id;
	private String code;
}
*/

@Data
@NoArgsConstructor
public class Product {
	@NonNull
	private Integer id;
	private String code;
}
