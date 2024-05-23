package rgukt.com;

import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component
@ConfigurationProperties(prefix="my.epic")
public class Mapping implements CommandLineRunner {
	private Map<String,Integer> edea;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);

	}
	public Map<String, Integer> getEdea() {
		return edea;
	}
	public void setEdea(Map<String, Integer> edea) {
		this.edea = edea;
	}
	@Override
	public String toString() {
		return "Mapping [edea=" + edea + "]";
	}


}
