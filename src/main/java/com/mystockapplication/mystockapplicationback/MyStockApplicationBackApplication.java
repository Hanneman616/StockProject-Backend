package com.mystockapplication.mystockapplicationback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.mystockapplication.mystockapplicationback"})

public class MyStockApplicationBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyStockApplicationBackApplication.class, args);
	}

}
