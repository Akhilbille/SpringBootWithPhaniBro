package com.Practise.BootToJPA;

import com.Practise.BootToJPA.Services.RentalSystem;
import com.Practise.BootToJPA.Services.Upstox;
import com.Practise.BootToJPA.Services.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootToJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(BootToJpaApplication.class, args);

		//Spring Boot - IOC and DI
//		RentalSystem app = context.getBean(RentalSystem.class);
//		app.bookVehicle(2);

		//Externalizing configuration
//		app.checkApiDetails();

		//Creating manual beans
//		var upstox = context.getBean(Upstox.class);

		//Bean Scopes
		//Initially scope of a bean is singleton.
//		var app1 = context.getBean(RentalSystem.class);
//		var app2 = context.getBean(RentalSystem.class);
//		System.out.println("request1: "+app1.hashCode());
//		System.out.println("request2: "+app2.hashCode());

		//PostConstruct and preDestroy
//		System.out.println("request1: "+app1.hashCode());


		//SpringDataJPA CrudRepository
		var userService = context.getBean(UserService.class);
		userService.getAllUsers().forEach(System.out::println);






	}

}
