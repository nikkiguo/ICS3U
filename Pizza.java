/* Create a program that will allow the user to enter in if they want a
large or extra-large pizza. The program will then calculate the cost of pizza
and the HST taxes (constant). Displays the cost, tax and the final cost */

import java.text.*;

public class Pizza
{
    public static void main (String[] args)
    {
	// Declare variables for order, topping, prices, constant tax
	char order;
	int toppingNumber;
	double toppingPrice = 0.00;
	final double LARGE = 6.00;
	final double EXTRALARGE = 10.00;
	final double ONETOPPING = 1.00;
	final double TWOTOPPING = 1.75;
	final double THREETOPPING = 2.50;
	final double FOURTOPPING = 3.25;
	double tax;
	double subtotal;
	double total;
	final double HST = 0.13;

	// Round values when needed and add money symbol
	DecimalFormat round = new DecimalFormat ("$#.00");

	// Get user input of pizza size and toppings
	System.out.print ("Would you like large (L) or extra large (E)? ");
	order = In.getChar ();

	System.out.print ("How many toppings (not including cheese)? ");
	toppingNumber = In.getInt ();

	// Calculate topping price based on number of toppings
	if (toppingNumber == 1)
	{
	    toppingPrice = ONETOPPING;
	}
	else if (toppingNumber == 2)
	{
	    toppingPrice = TWOTOPPING;
	}
	else if (toppingNumber == 3)
	{
	    toppingPrice = THREETOPPING;
	}
	else if (toppingNumber == 4)
	{
	    toppingPrice = FOURTOPPING;
	}

	// Determine subtotal/total based on size/toppings, output price
	if (order == 'L' || order == 'l')
	{
	    subtotal = LARGE + toppingPrice;
	    tax = subtotal * HST;
	    total = subtotal + tax;
	    System.out.println ("\nYou ordered a " + order + " pizza and "
		    + toppingNumber + " toppings"
		    + "\nSubtotal " + round.format (subtotal)
		    + ", tax " + round.format (tax) + "\nTotal "
		    + round.format (total));
	}
	// if extra large pizza is chosen
	else
	{
	    subtotal = EXTRALARGE + toppingPrice;
	    tax = subtotal * HST;
	    total = subtotal + tax;
	    System.out.println ("\nYou ordered " + order + " size pizza with "
		    + toppingNumber + " toppings"
		    + "\nSubtotal " + round.format (subtotal)
		    + ", tax " + round.format (tax) + "\nTotal "
		    + round.format (total));
	}
    }
}
