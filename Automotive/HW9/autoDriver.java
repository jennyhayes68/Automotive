/*************************************************************************************
Author's Name: Jenny Hayes
Date: 3/25/21
Program: HW9
Description: Inhertiance- Car class inherting Automotive class
*************************************************************************************/
import java.util.*;

public class autoDriver                     //Driver class
{


	 static Scanner console=new Scanner(System.in);

	public static void main(String[] args)
	{
     Automotive Qx56=new Automotive();                              //testing the Qx56 object
     System.out.println("Automotive Qx56: " +Qx56);
     Automotive Qx80=new Automotive(4,220,"9/16/2006");
     System.out.println("Automotive Qx80: " +Qx80);
     Qx80.setNumWheels(4);                                      //setting the data for the Qx80 object
     Qx80.setMPH(150);
     Qx80.setManfDate("June 8,2005");
     Qx80.printAutoDetails();
     Qx80.toString();
     System.out.println();

     Car vw=new Car(3,180,"May 13, 1915", "Toyota");             //Testing the car object
     System.out.println("Car vw: " +vw);
     System.out.println();
     vw.printAutoDetails();                              //printing the current value
     vw.toString();



   }
}