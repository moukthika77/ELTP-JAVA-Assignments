package com.psl.learning.demo;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={2,3,4,130,5,7,9,44,100};
		System.out.println("no of even nos in array :"+even(arr));
		evenandfive(arr);
		System.out.println("no of characters in string "+charinstring("Sun rises in the east"));
		System.out.println("no of vowels "+vowels("Moukthika"));
		System.out.println("no of spaces "+space("Sun rises in the east"));
		pattern(4);
		hellopattern("HELLO");
		split("Sun rises in the east");

	}
	public static int even(int arr[])
	{
		int c=0;
		for(int i=0;i<arr.length;i++)
			if(arr[i]%2==0)
				c++;
		return c;
	}
	public static void evenandfive(int arr[])
	{
		for(int i=0;i<arr.length;i++)
			if(arr[i]%10==0)
				System.out.println(arr[i]+" ");
		System.out.println();
	}
	public static int charinstring(String st)
	{
		int c=0;
		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)!=' ')
				c++;
		}
		return c;
	}
	public static int vowels(String st)
	{
		int c=0;
		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)=='a'||st.charAt(i)=='e'||st.charAt(i)=='i'||st.charAt(i)=='o'||st.charAt(i)=='u')
				c++;
		}
		return c;
	}
	public static int space(String st)
	{
		int c=0;
		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)==' ')
				c++;
		}
		return c;
	}
	public static void pattern(int rows)
	{
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
				
			}
			System.out.println();
		}
		for(int i=rows-1;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public static void hellopattern(String st)
	{
		char[] a=st.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<=i;j++)
			System.out.print(a[j]);
		System.out.println();
		}
	}
	public static void split(String st)
	{
		String[] arr=st.split("\\s");
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}

}
