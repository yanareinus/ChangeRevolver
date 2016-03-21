
public class MakeChange {
	//variables
		private int quarters;
		private int dimes;
		private int nickels;
		private int pennies;
		//sets methods
		void  setQuarters(int quarters)
		{this.quarters=quarters;}
		void setDimes(int dimes)
		{this.dimes=dimes;}
		void  setNickels(int nickels)
		{this.nickels=nickels;}
		void setPennies(int pennies)
		{this.pennies=pennies;}
		//gets methods
		int getQuarters()
		{ return quarters;}
		int getDimes()
		{ return dimes;}
		int getNickels()
		{ return nickels;}
		int getPennies()
		{ return pennies;}
		//calculation of the total
		  double calculation()// calculation method was exchanged with Peixin Wang
		{
		
			 double dollars = (0.25 * quarters) + (0.10 * dimes) + (0.05 * nickels) + (0.01 * pennies);
			 return dollars;
		}
		 
		
		
}
