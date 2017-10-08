package evolution;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("development")
public class DevelopmentComponent implements AnyComponent {
	public void anyMethod() {
		System.out.println("Development Component");
	}
}
