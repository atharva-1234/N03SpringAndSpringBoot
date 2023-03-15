package org.tnsif.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Diusingcollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ApplicationContext c=new ClassPathXmlApplicationContext("collection.xml");
    CollectionDemo d=c.getBean("col",CollectionDemo.class);
    c.getDisplayName();
	}

}
