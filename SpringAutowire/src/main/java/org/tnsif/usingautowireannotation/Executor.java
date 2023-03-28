package org.tnsif.usingautowireannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ApplicationContext c=new ClassPathXmlApplicationContext("web.xml");
    Remote r=c.getBean("remote",Remote.class);
    r.remote();
	}

}
