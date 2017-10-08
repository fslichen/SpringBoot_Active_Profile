package evolution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	private AnyComponent anyComponent;
	
	@Autowired
	private AnyBean anyBean;
	
	// Run the executable jar file in commander line like: java -jar SpringBoot_Profile-0.0.1-SNAPSHOT.jar --spring.profiles.active=production,test
	public static void main(String[] args) {// Please do plug in the args otherwise command line arguments are ignored.
		SpringApplication.run(Application.class, args).close();// Close the application immediately once it is started.
	}

	@Override
	public void run(String... arg0) throws Exception {
		anyComponent.anyMethod();
		System.out.println(anyBean.getDate());
	}
}
