package org.tnsif.objectsInjection;

public class CellPhone {
  Charger charger;
  
  public void setCharger(Charger charger) {
	  this.charger= charger;
  }
  
  // injecting object of charger class
   public void accept()
   {
	   charger.power();
   }
}
