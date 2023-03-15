package org.tnsif.objectsInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DLUsingObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     BeanFactory f=new ClassPathXmlApplicationContext("web.xml");
     CellPhone e=f.getBean("c2",CellPhone.class);
     System.out.println(e);
     
	}

}
