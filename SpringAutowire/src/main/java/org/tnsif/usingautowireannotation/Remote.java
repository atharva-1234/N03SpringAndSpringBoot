package org.tnsif.usingautowireannotation;

public class Remote {
  private Cell cell;
//DI using setters

public void setCell(Cell cell) {
	this.cell = cell;
}

public Remote() {
	System.out.println("Default constructor for remote ");
}
  public void remote()
  {
	  cell.power();
  }
  
  
}
