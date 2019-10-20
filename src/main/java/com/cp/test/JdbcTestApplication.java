package com.cp.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cp.model.User;
import com.cp.service.UserService;

@SpringBootApplication(scanBasePackages = {"com.cp"} )
public class JdbcTestApplication {

@Autowired
private UserService userService;
	public static void main(String[] args) {
		
	ApplicationContext context=SpringApplication.run(JdbcTestApplication.class, args);
		
	UserService userService = context.getBean(UserService.class);
	
	User user = new User();
	user.setName("chinki");
	user.setPassword("chinki@123");
	User user1 = userService.saveUser(user);
	System.out.println(user1);
	

	
	
	
	}

}
