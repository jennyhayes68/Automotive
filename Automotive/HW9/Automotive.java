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
