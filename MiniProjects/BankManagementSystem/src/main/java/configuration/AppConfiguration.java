package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import service.BankServiceImpl;

@Configuration
@ComponentScan(basePackages = "service")
public class AppConfiguration {


}
