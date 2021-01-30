package com.psl.learning.demo;

public class LanguageFundamental {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println(LanguageFundamental.getMax(5,15 ,3));
		System.out.println(LanguageFundamental.checkAlpha('a'));
		System.out.println(LanguageFundamental.checkAlpha('d'));
		System.out.println(LanguageFundamental.calTax(240));
		System.out.println(LanguageFundamental.calInterest(5789));
		LanguageFundamental.printPrime(25);
		System.out.println();
		System.out.println(LanguageFundamental.isPrimeNumber(13));
		System.out.println(LanguageFundamental.calculateProfit(13));
		System.out.println(LanguageFundamental.electricity("domestic",450));
		System.out.println(LanguageFundamental.electricity("commercial",300));
		LanguageFundamental.displayMultiplicationMatrix();
		
	}
	public static double calTax(int gp)
	{
		if(gp<240 ||gp==240)
			return (double)0;
		else if(gp>240 && gp<480)
			return gp*(double)0.15;
		else 
			return gp*0.28;
		
	}
	public static int getMax(int x,int y,int z)
	{
		return (x>y)&&(x>z)?x:(y>z)?y:z;
	}
	public static boolean checkAlpha(char alph) 
	{
		if(alph=='a' || alph=='e'|| alph=='i'|| alph=='o'|| alph=='u')
			return true;
		else if(alph=='A' || alph=='E'|| alph=='I'|| alph=='O'|| alph=='U')
			return true;
		else
			return false;
	}
	public static double calInterest(int amt)  
	{
		double d;
		if(amt<=1000)
			d=(amt*1*4)/100;
		else if(amt>1000 && amt<=5000)
			d=(amt*1*4.5)/100;
		else
			d=(double)(amt*1*5)/100;
		return d;
	}
	public static  boolean isPrimeNumber( int num) 
	{
		boolean flag = false;
	    for (int i = 2; i <= num / 2; ++i) {
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	    return true;
	    else
	      return false;
	
	}
	public static void printPrime(int maxVal)
	{
		int count=0;
	for(int i = 2; i <= maxVal; i++)
	{
		for( int j = 2; j < i; j++)
		{
			if(i % j == 0)
			{
				count = 0;
				break;
			}
			else
			{
				count = 1;
			}
		}
		if(count == 1)
		{
			System.out.print(i+" ");
		}
	}
	}
	public static float calculateProfit( int numAttendees) 
	{
		float theaterCost=20;
	float earnFromTickets=5*numAttendees;
    float attendeesCost=numAttendees*(float)0.50;
    float cost=attendeesCost+theaterCost;
    float profit=earnFromTickets-cost;
      return profit;
	}
	
	public static float calLoan(int amount)
	{
		if (amount<500)
		     return (float)(0.0025*amount);
		   else if((amount>500)&&(amount<1500))
		     return(float)((0.0025*500)+(0.0050*(amount-500)));
		   else if((amount>1500)&&(amount<2500))
		     return(float)((0.0025*500)+(0.0050*1000)+(0.0075*(amount-1500)));
		   else
		     return(float)((0.0025*500)+(0.0050*1000)+(0.0075*1000)+(0.0100*(amount-2500)));
		
	}
	
	
	
	
	
	public static void displayMultiplicationMatrix()
	{
		 
		    int[][] table = new int[12][12];
		    for(int i = 0 ; i < table.length ; ++i) {
		      for(int j = 0 ; j < table[i].length ; ++j) {
		        table[i][j] = (i+1)*(j+1);
		      }
		    }
		    System.out.print("      :");  
		    for(int j = 1 ; j <= table[0].length ; ++j) {
		      System.out.print((j<10 ? "   ": "  ") + j);
		    }
		    System.out.println("\n-------------------------------------------------------");

		    for(int i = 0 ; i < table.length ; ++i) {
		      System.out.print(  (i<9 ? "  ":" ") + (i+1) + ":");
		 
		      for(int j = 0; j < table[i].length; ++j) {
		        System.out.print((table[i][j] < 10 ? "   " : table[i][j] < 100 ? "  " : " ") + table[i][j]);
		      }
		      System.out.println();
		    }
	}
	
	
	public static double electricity(String st,int units)
	{
		if(st.equals("domestic"))
		{
			if(units<100)
			{
				return (units*4 )> 250?units*4:250;
			}
			else if (units>=100 && units<=300)
				return units*4.5;
			
			else if(units>300 && units<=500)
				return units*4.75;
			else
				return units*5;
		}
		else
		{
			if(units<100)
			{
				return (units*4.5 )> 350?units*4.5:350;
			}
			else if (units>=100 && units<=300)
				return units*4.75;
			else if(units>300 && units<=500)
				return units*5;
			else
				return units*5.25;
		}
	}
	
}

