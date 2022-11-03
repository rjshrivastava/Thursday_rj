/*
Accept age and gender from user and display the rate of interest as follow

age above 60 and gender Male (RI= 7 %)
age above 60 and gender FeMale (RI= 7.5 %)
below 60 age = RI 5%
*/




package pk;

import java.util.Scanner;

public class progm2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter age");
		int age = sc.nextInt();
		
		System.out.println("Enter sex: M/F");
		int sex = sc.next().charAt(0);
		
		if(sex == 'F') 
		{
			if(age >= 60) 
			{
				System.out.println("Rate of interrest=7.5%");
			}
			else if( age <60 ) 
			{
				System.out.println("Rate of interrest=5%");
			}
		}
		if(sex == 'M')
		{
			if(age >= 60) 
			{
				System.out.println("Rate of interrest=7%");
			}
			else if( age <60 ) 
			{
				System.out.println("Rate of interrest=5%");
			}
		else 
		{
			System.out.println("ERROR");
		}

	}
	}
}
