package org.tnsif.springmvc;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication

/*
 *  @SpringBootApplication 
 *  a convince annotation that wraps commonly used annotation 
 *  used in place of following 3 different annotations 
 *  
 *  1. @configuration : instruct that a Spring configuration claas is being use instead of XML
 *  
 *  3. @ ComponentScan : Scan project for spring components annotation with @Servie ,@REpository
 *  @ Component 
 *  It is used to donate that a class is a component 
 *  it allows Spring to automatically detect our custom beans 
 */
public class SpringMvcApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringMvcApplication.class, args);
		Scanner s= new Scanner(System.in);
		
		/*int x=s.nextInt();
		System.out.println(x);*/
		/*Employee e=context.getBean(Employee.class);
		e.setEmpid(101010);
		e.setEmpname("Atharva Shirole");
		e.print();*/
		HomeController h= context.getBean(HomeController.class);
		h.home();
        s.close();
	}

}
