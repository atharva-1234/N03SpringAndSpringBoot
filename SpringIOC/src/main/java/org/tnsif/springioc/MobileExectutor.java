package org.tnsif.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileExectutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//hard coding 
		/*Airtel a=new Airtel();
		a.call();
		a.message();
		
		Jio j=new Jio();
		j.call();
		j.message();
		*/
		
		/*ApplicationContext c=new ClassPathXmlApplicationContext(" Beans.xml");
		Airtel a=(Airtel)c.getBean("airtel ");*/
		
		ApplicationContext c=new ClassPathXmlApplicationContext(" Beans.xml");
		/*Jio a=(Jio)c.getBean("jio");
		a.call();
		a.message();*/
		
		Sim s=c.getBean("sim",Sim.class);
		s.call();
		s.message();
	}

}
