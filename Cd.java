/* Write a program that requests the number of CD ordered and displays/outputs
the total cost. */

import java.text.*;

public class Cd
{
    public static void main (String[] args)
    {
	// Declare cd order, price and cost variables
	int cdOrder;
	final double PRICE_DISCOUNT = 0.30;
	final double PRICE_REG = 0.50;
	double totalCost;

	// Round values to two decimal places when necessary
	DecimalFormat round = new DecimalFormat ("$##.00");

	// Get user input of CDs purchased
	System.out.print ("How many CDs did you purchase? ");
	cdOrder = In.getInt ();

	// Determine whether or not to use discounted price based on cd order
	if (cdOrder >= 25)
	{
	    totalCost = cdOrder * PRICE_DISCOUNT;
	}
	else
	{
	    totalCost = cdOrder * PRICE_REG;
	}

	// Output of total cost
	System.out.println ("Total price: " + round.format (totalCost));


    }
}
