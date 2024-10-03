package amazon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan(basePackages = "amazon")
@SpringBootApplication
public class AmazonProductsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmazonProductsApplication.class, args);
		System.out.println("Welcome to amazon products");
	}

}
