package com.psl.learning.demo;

import java.util.Random;

 class Medicine {

	public void display()
	{
		System.out.println("Company Name :"+ "ABC Company");
		System.out.println("Address :"+"Hyderabad , Telangana");
	}

}
class Tablet extends Medicine
{
	public void display()
	{
		System.out.println("Additional info :"+"Store in cool dry place");
	}
}
class Syrup extends Medicine
{
	public void display()
	{
		System.out.println("Additional info :"+"For age above 5yrs");
	}
}
class Ointment extends Medicine
{
	public void display()
	{
		System.out.println("Additional info :"+"For external use only");
	}
}
public class TestMedicine
 {
	 public static void main(String[] args) {
			// TODO Auto-generated method stub
		 int d=0;
		Medicine[] m=new Medicine[10];
		 Random rand=new Random();
		 for(int i=0;i<9;i++)
		 {
		 int r1=rand.nextInt(4);
		 if(r1==1)
		 {
			 Medicine t= new Tablet();
			 m[d]=t;	 
		 }
		 else if(r1==2)
		 {
			 Medicine s=new Syrup();
			 m[d]=s;	 
		 }
		 else
		 {
			 Medicine o= new Ointment();
			 m[d]=o;
		 }
		 d++;
		 }
		 for(int i=0;i<9;i++)
		 m[i].display();
		 

		}
 }
