package org.tnsif.autowireexample;

public class Oxygen {
	// DI in form of object 
	Human h;

	public void setH(Human h) {
		this.h = h;
	}
	// injecting the object of human
	public void accept ()
	{
		h.boady();
	}
}
