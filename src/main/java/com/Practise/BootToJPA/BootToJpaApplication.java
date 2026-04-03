package com.Practise.BootToJPA;

import com.Practise.BootToJPA.Services.RentalSystem;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootToJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(BootToJpaApplication.class, args);

		//Spring Boot - IOC and DI
		RentalSystem app = context.getBean(RentalSystem.class);
		app.bookVehicle(2);


	}

}
