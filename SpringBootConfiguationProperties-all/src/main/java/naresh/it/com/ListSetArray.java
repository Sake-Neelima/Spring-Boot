package naresh.it.com;


import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component
@ConfigurationProperties(prefix="my.epic")
public class ListSetArray implements CommandLineRunner {
	private List<String> colors;
	private Set<String> modes;
	private String[] fruits;
	
	
	@Override
	public String toString() {
		return "ListSetArray [colors=" + colors + ", modes=" + modes + ", fruits=" + Arrays.toString(fruits) + "]";
	}


	public List<String> getColors() {
		return colors;
	}


	public void setColors(List<String> colors) {
		this.colors = colors;
	}


	public Set<String> getModes() {
		return modes;
	}


	public void setModes(Set<String> modes) {
		this.modes = modes;
	}


	public String[] getFruits() {
		return fruits;
	}


	public void setFruits(String[] fruits) {
		this.fruits = fruits;
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);

	}



	

}
