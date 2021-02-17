package com.java21days;

public class InvestmentCalc {
	public static void main(String[] arguments) {
		// Time to plug in the initial investment
		double invest = 14000;
		double yearOneChange = 0.40;
		System.out.println("When $" + invest + " grows in year 1 by 40% you get...");
		// Multiply Year 1
		yearOneChange = yearOneChange * invest;
		// Add to Year 1 Investment
		invest = yearOneChange + invest;
		// Print out results
		System.out.println("$" + invest);
		
		// Congrats! Year 1 has now been shown  Time for Year 2 Electric Boogaloo
		
		System.out.println("When $" + invest + " takes a $1,500 loss in year 2 you get...");
		
		// remove 1,500 from the invest module which is holding the main account numbers
		
		invest = invest - 1500;
		
		System.out.println("$" + invest);
		
		// Sweeeeet! We got year 2 in the books, too bad for the poor person's account
		// don't worry we'll make it up for them in the final year, the Return of the Investment!
		
		System.out.println("When $" + invest + " grows in year 3 by 12% you get...");
		
		//Set Variable for year 3 change
		
		double yearThreeChange = 0.12;
		
		// Time to do the math!
		
		yearThreeChange = invest * yearThreeChange;
		
		// Cool we captured the Delta, time to add!
		
		invest = yearThreeChange + invest;
		
		// aaaaannnnnndddd Time to print it!
		
		System.out.println("$" + invest);
		
		
	}
}



/* 
Instructions:  Create a program that calculates how much a $14,000 investment would be worth if
it increased in value by 40% during the first year, lost $1,500 in value the second year and
increased 12% in the third year.
*/

/*
Assigment was completed and checked by calculation on phone calculator.
*/