package evolution;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("production")
public class ProductionComponent implements AnyComponent {
	public void anyMethod() {
		System.out.println("Production Component");
	}
}
