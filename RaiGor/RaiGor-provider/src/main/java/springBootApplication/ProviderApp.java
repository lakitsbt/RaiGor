package springBootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableEurekaServer
@SpringBootApplication
public class ProviderApp {
	public static void main(String[] args) {
        SpringApplication.run(ProviderApp.class,args);
    }
}
