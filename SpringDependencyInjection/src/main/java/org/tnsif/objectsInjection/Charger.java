package org.tnsif.objectsInjection;

public class Charger {
              
	private String brand;
	private String type;
	private int voltype;
	
	// 
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setVoltype(int voltype) {
		this.voltype = voltype;
	}
	
	public void power()
	{
		System.out.println("Details related to charger");
		System.out.print("Brand:" +brand+ " " + "voltage" +voltype+ " Type:"+type);
		
	}
	@Override
	public String toString() {
		return "Charger [brand=" + brand + ", type=" + type + ", voltype=" + voltype + "]";
	}
	
	
}
