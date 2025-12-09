
Car class inherting automotive class
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


/*************************************************************************************
Author's Name: Jenny Hayes
Date: 3/25/21
Program: HW9
Description: Inhertiance- Car class inherting Automotive class
*************************************************************************************/



public class Automotive
{
  private int numWheels;
  private int MPH;
  private String manfDate;

public Automotive()                                         //default constuctor
{
  numWheels=0;
  MPH=0;
  manfDate="unknown";
}

public Automotive(int nW, int mph, String mD)              //constructor with parameters
{
  numWheels=nW;
  MPH=mph;
  manfDate=mD;
}

public void setNumWheels(int nW)                      // setting mutators
 {
  numWheels=nW;
 }

public void setMPH(int mph)
 {
  MPH=mph;
 }

public void setManfDate(String mD)
 {
  manfDate=mD;
 }

public int getNumWheels()                          //setting accessors
 {
  return numWheels;
 }

public int getMph()
 {
  return MPH;
 }

public String getManfDate()
 {
  return manfDate;
 }

 public void printAutoDetails()
 {
  System.out.println("Number of wheels: " +numWheels+ " Speed: " +MPH+ " Manufactured Date: " +manfDate);
 }

public String toString()
 {
     return("Number of wheels: " +numWheels+ " Speed: " +MPH+ " Manufactured Date: " +manfDate);
 }
}
/*************************************************************************************
Author's Name: Jenny Hayes
Date: 3/25/21
Program: HW9
Description: Inhertiance- Car class inherting Automotive class
*************************************************************************************/


public class Car extends Automotive                         //extending inheritance to the Car class
{
 private String makersName;
 private int date;
 private int curValue;

public Car()                                            //inherting the super class constructor
{
 super();
 makersName="unknown";
 date=0;
 curValue=0;

}

public Car(int nW, int mph, String mD, String mN)
 {
  super(nW, mph, mD);                                   //inherting the super class variables
  makersName=mN;

 }

public void printAutoDetails()                            //overridding superclass printautoDetails
 {
	 if(date>1/1/80 && date<12/31/2000)

	 	  System.out.println("curValue=$1000");
         else
	         System.out.println("curValue=$10,000");

}
                                                            //inherting the super class methods.
public String toString()
 {
 return ("Number of wheels: "+super.getNumWheels()+"," +" Speed: " + super.getMph()+"," +" Manufactured Date: " +super.getManfDate()+","  +
 " Brand: "+ makersName);

  }




