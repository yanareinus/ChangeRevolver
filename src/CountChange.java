
public class CountChange {
	//variables
		private int Quarters;
		private int Dimes;
		private int Nickels;
		private int Pennies;
		private int Cents;
		// set cents
		void setCents(int Cents)
		{this.Cents=Cents;}
		
		//gets methods
		int getQuarters()
		{return Quarters;}
	    int getDimes()
		{return Dimes;}
		int getNickels()
		{ return Nickels;}
		int getPennies()
		{ return Pennies;}
		

		void calculation ()// calculate number of Quarters,Dimes,Nickels and Pennies
		{
			Quarters=Cents/25;// calculating how many cents we have by dividing the user input by 25
			int Remaining= Cents-(Quarters*25);// how much money we have left after calculating the number of quarters.
			
			//for Dimes
			Dimes=Remaining/10;// money we have left divided by 10 to get the number of dimes we have
			int Remaining1=Remaining-(Dimes*10);//how much money we have left after calculating the number of dimes
			
			
	        //for Nickels
			Nickels=Remaining1/5;// calculating nickels using the same method i used for quarters and dimes
			//for pennies
			 Pennies=Remaining1-(Nickels*5);// the reaming ( after calculating quarters,dimes and nickels ) will be the pennies.
		
		}

		
}



		

