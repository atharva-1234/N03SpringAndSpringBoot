package org.tnsif.usingautowireannotation;

public class Cell {
       // private  data members 
	private String company;
	private String size;
	
	// getters and setters
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public Cell() {
		System.out.println("constructor for cell");
	}
	 public void power() {
		 System.out.println("company of cell"+company);
		 System.out.println("size of cell"+size);
		 
	 }
	
}
