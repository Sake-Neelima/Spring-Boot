package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.ProductRepository.Myview;
@Component
public class findByRunner implements CommandLineRunner {
	@Autowired ProductRepository prepo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//prepo.findByProdname("S-TV").forEach(System.out::println);
		
		
		//prepo.findByProdcostGreaterThan(3000.0).forEach(System.out::println);
		//prepo.findByProdcostGreaterThanEqual(4000.0).forEach(System.out::println);
		//prepo.findByProdcostLessThan(2000.0).forEach(System.out::println);
		//prepo.findByProdcostLessThanEqual(2345.45).forEach(System.out::println);
		
		//prepo.findByProdgradeIsNull().forEach(System.out::println);
		//prepo.findByProdgradeIsNotNull().forEach(System.out::println);
		
		/*prepo.findByProdnameLike("S%").forEach(System.out::println);
		prepo.findByProdnameLike("%V").forEach(System.out::println);
		prepo.findByProdnameLike("___").forEach(System.out::println);
		prepo.findByProdnameLike("%T%").forEach(System.out::println);*/
		
		/*prepo.findByProdnameNotLike("S%").forEach(System.out::println);
		prepo.findByProdnameStartingWith("t").forEach(System.out::println);
		prepo.findByProdnameEndingWith("V").forEach(System.out::println);
		prepo.findByProdnameContaining("T").forEach(System.out::println);*/
		
		
		//prepo.findByProdcodeLikeAndProdcostGreaterThanEqual("L%",3456.0).forEach(System.out::println);
		//prepo.findByProdcodeLikeOrProdcostGreaterThanEqual("L%",3456.0).forEach(System.out::println);
		
		//prepo.findByProdnameLikeOrderByProdcost("___").forEach(System.out::println);
		//prepo.findByProdnameLikeOrderByProdcostDesc("%T%").forEach(System.out::println);
		
		List<Myview> list=prepo.findByProdgrade("A");
		for(Myview m:list) {
			System.out.println(m.getProdname()+" "+m.getProdcost());
		}
		
	}

}
