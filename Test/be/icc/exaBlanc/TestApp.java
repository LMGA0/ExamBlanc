package be.icc.exaBlanc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestApp {

	
	   @Test
	   
	 public void testAddRentedDisc() {

	        //prep

	        String titre = "Glory Box";
	        String username = "Ludo";
	        float prixLocation = 2;
	        int dureeLocation = 3;
	       
	        //utilisation

	       RentedDisc TempRd = new RentedDisc("Glory Box", "Ludo", 2, 3);
	       RentedDisc rd1 = new RentedDisc("Glory Box", "Ludo", 2, 5);
	    
	        //verif

	        assertEquals(username, TempRd.getUsername());
	        System.out.println(TempRd);
	   }
}


