package evolution;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("production")
public class ProductionConfiguration implements AnyConfiguration {
	@Bean
	@Override
	public AnyBean anyDate() {
		AnyBean anyBean = new AnyBean();
		anyBean.setDate(new Date());
		return anyBean;
	}
}
