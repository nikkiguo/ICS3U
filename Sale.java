/* Write a program that calculates a 25% discount for selected items and
output price,sale price,and discount.*/

import java.text.*;

public class Sale
{
    public static void main (String[] args)
    {
	// Declare variables for price/discount, constant discount
	double regularPrice, discount, salePrice, discountAmount;
	char onSale;
	final double DISCOUNT = 0.25;

	// Round values when needed and add money symbol
	DecimalFormat round = new DecimalFormat ("$#.00");

	// Get user input of regular price and sale
	System.out.print ("Regular price: $");
	regularPrice = In.getDouble ();

	System.out.print ("On sale? (Y/N) ");
	onSale = In.getChar ();

	// Determine whether or not on sale, calculate prices, output new price
	if (onSale == 'Y')
	{
	    discountAmount = regularPrice * DISCOUNT;
	    salePrice = regularPrice - discountAmount;
	    System.out.println ("\nSale price: " + round.format (salePrice)
		    + "\nDiscount: " + round.format (discountAmount));
	}                                                                   
	else
	{
	    System.out.println ("\nRegular price: S" + regularPrice);
	}
    }
}
