package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	interface Myview{
		String getProdname();
		Double getProdcost();
	}
	
	//-------------1.Basics----------------		
	List<Product> findByProdname(String prodname);
	List<Product> findByProdcostGreaterThan(Double prodcost);
	List<Product> findByProdcostGreaterThanEqual(Double prodcost);
	List<Product> findByProdcostLessThan(Double prodcost);
	List<Product> findByProdcostLessThanEqual(Double prodcost);
	
	List<Product> findByProdgradeIsNull();
	List<Product> findByProdgradeIsNotNull();
	
	//-----------------Like operator-------------
	List<Product> findByProdnameLike(String prodname);
	List<Product> findByProdnameNotLike(String prodname);
	List<Product> findByProdnameStartingWith(String prodname);
	List<Product> findByProdnameEndingWith(String prodname);
	List<Product> findByProdnameContaining(String prodname);
	
	//----------------And/or----------------------
	
	List<Product> findByProdcodeLikeAndProdcostGreaterThanEqual(String prodcode,Double prodcost);
	List<Product> findByProdcodeLikeOrProdcostGreaterThanEqual(String prodcode,Double prodcost);
	
	//--------------OrderBy----------------------
	List<Product> findByProdnameLikeOrderByProdcost(String prodname);
	List<Product> findByProdnameLikeOrderByProdcostDesc(String prodname);
	
	//---------------projections----------------
	List<Myview> findByProdgrade(String prodgrade);
	
	
}
