package com.horsie.paymentsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class PaymentsapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentsapiApplication.class, args);
	}
}
