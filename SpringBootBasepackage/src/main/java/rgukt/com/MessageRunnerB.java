package rgukt.com;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component
@Order(80)
public class MessageRunnerB implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Message-B");

	}

}
