/*
Student Name:Yael Yana Reinus    
Assignment #2
Class:CIS4160
ChangeRevolver
the code shows a menu to the user. based on user input,ChangeRevolver will call the class(MakeChange,CountChange or exit the menu). 

9.26.2015
*/

import java.util.Scanner;
public class ChangeRevolver {
	public static void main(String [] args)

	{	
			
		int choice=0;
		do{
		Scanner in=new Scanner(System.in);	
		System.out.println("--------------");//menu
		System.out.println("1.MakeChange ");
		System.out.println("2.CountChange ");
		System.out.println("3.Exist "); 
		choice=in.nextInt();
		while(choice>3|| choice<1)//input validation: user enters value 1-3.
		{
			System.out.println("ERROR: Enter a value in the range 1-3: ");
			System.out.println("Enter again ");
			choice=in.nextInt();
			System.out.println("--------------");

		}

		
		if(choice==1)// MakeChange
		{
			MakeChange test=new MakeChange();//test object
			//variables
			int Quarters;
			int Dimes;
			int nickels;
			int Pennies;
			System.out.println("Enter the number of quarters:");
			Quarters=in.nextInt();
	  	    System.out.println("Enter the number of dimes:");
	       	Dimes=in.nextInt();
	       	System.out.println("Enter the number of nickels:");
		    nickels=in.nextInt();
			System.out.println("Enter the number of pennies:");
			Pennies=in.nextInt();
			
		    //sets methods
			test.setQuarters(Quarters);
			test.setDimes(Dimes);
			test.setNickels(nickels);
			test.setPennies(Pennies);
			
		// showing the data the user entered by using get methods
		   System.out.println("The data you entered:");
		   System.out.println("--------------");
		   System.out.println("Quarters: "+test.getQuarters());
		   System.out.println("Dimes: "+test.getDimes());
		   System.out.println("Nickels: "+test.getNickels());
		   System.out.println("Pennies: "+test.getPennies());
		   double total;
	       total=test.calculation();//calling the calculation method to get the total
		   System.out.println("Total: $"+total);
		}
					
		else if(choice==2)//CountChange
		{
			int cents=0;
			CountChange test1=new CountChange();//test1 object
			System.out.println("Enter a sum of money in cents:");		
		
		cents=in.nextInt();
		while(cents<=0)// input validation: user enters a positive number
		{
			System.out.println("ERROR:Enter a posetive number");
			System.out.println("Enter again");
			cents=in.nextInt();	
		}
		test1.setCents(cents);// set cents
		test1.calculation();//calling the calculation method to calculate number of Quarters,Dimes,Nickels and Pennies

//results
		System.out.println("--------------");
		System.out.println("Quarters:" +test1.getQuarters()); 
		System.out.println("Dimes:"+test1.getDimes()); 
		System.out.println("Nickels:"+test1.getNickels());
		System.out.println("Pennies:"+test1.getPennies());	
			
		}
		else if(choice==3)//  user wants to exit the menu
		System.out.println("Bye Bye ");
		
		
		}while(choice!=3);// the menu will show up until user exit the menu
	
	}

}
