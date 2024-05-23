package Demo.app.Runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component
@Order(70)
public class MessageRunnerA implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		System.out.println("Message-A");
	}

}
