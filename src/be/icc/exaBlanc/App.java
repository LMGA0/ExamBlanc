package be.icc.exaBlanc;

import java.io.IOException;
import java.util.ArrayList;


public class App {
	
	public static void main (String [] args) {
		
		
		ArrayList <RentedDisc> rentedD = new ArrayList<>();
		
		RentedDisc rd1 = new RentedDisc("Glory Box", "Ludo", 2, 5);
		RentedDisc rd2 = new RentedDisc("Humming", "Ludo", 3, 0);
		RentedDisc rd3 = new RentedDisc("Only you", "Ludo", 2, 33);
		
		System.out.println(rd1);
		System.out.println(rd2);
		System.out.println(rd3);
		
		
		rentedD.add(rd1);
		rentedD.add(rd2);
		rentedD.add(rd3);
	
		System.out.println(rentedD);
		
		
		
		try {
			rentedD.toXMLFile("data\\RentedD.xml");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
				
		try {
			rentedD2 = new ArrayList<RentedDisc>()("data\\RentedD.xml");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
