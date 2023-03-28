package org.tnsif.autowireexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
      Oxygen o=c.getBean("oxygen",Oxygen.class);
      o.accept();
	}

}
