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




}