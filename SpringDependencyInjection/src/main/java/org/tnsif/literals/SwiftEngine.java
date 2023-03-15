package org.tnsif.literals;

public class SwiftEngine  implements IEngine {

	private String company;
	 private double  cost;
	public double cost() {
		// TODO Auto-generated method stub
		return cost;
		
	}

	public String display() {
		// TODO Auto-generated method stub
		return "Japan";
	}
	
	public SwiftEngine(String company, double cost) {
		super();
		this.company = company;
		this.cost = cost;
	}

	// getter and setter 

	

	public void setCompany(String company) {
		this.company = company;
	}

	

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return  " Origin of company: " +company+" "+ fuel;
	}
	
	

}
