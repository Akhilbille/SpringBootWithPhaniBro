package com.Practise.BootToJPA;

import com.Practise.BootToJPA.Services.RentalSystem;
import com.Practise.BootToJPA.Services.Upstox;
import com.Practise.BootToJPA.Services.UserService;
import com.Practise.BootToJPA.entities.User;
import com.Practise.BootToJPA.respositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

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

//		userService.getAllUsers().forEach(System.out::println);

		//Relations and object creation
		var vinod = User.builder()
				.id(1025)

				.name("Vinod Kumar")
				.email("vinod@gmail.com")
				.password("dafsda")
				.phoneNumber("7896458962")
				.build(); //1.Transient state

//		var abc = userService.saveUser(vinod);

		var vinay = User.builder()
				.id(1026)
				.name("vinay Kumar")
				.email("vinay@gmail.com")
				.password("dafsda")
				.phoneNumber("7896458962")
				.build();

//		 userService.saveUsers(List.of(vinay,vinod)).forEach(System.out::println);

//		 userService.getAllUsers().forEach(u-> System.out.println(u.getEmail()));
//		 userService.getUserByIds(List.of(10100)).forEach(System.out::println);

//		System.out.println(userService.count());

//		userService.deleteUserById(1030);
//		'1029', 'Vinod Kumar', 'vinod@gmail.com', 'dafsda', '7896458962'
//		User userObj = User.builder()
//				.id(1029)
//				.name("Vinod Kumar")
//				.email("vinod@gmail.com")
//				.password("dafsda")
//				.phoneNumber("7896458962")
//				.build();
//		userService.deleteByObject(userObj);
//		userService.deleteAllUsersByIds(List.of(1027,1028));

//		userService.deleteUsersByObjects(List.of(vinay,vinod));
//		userService.deleteAllUsers();




	}

}
