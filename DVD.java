// Outputs bill given purchase amount and discount

import java.text.*;

public class DVD
{
    public static void main (String[] args)
    {
	// Initialize and declare variables and constants
	final double CD_PRICE = 13.99, DVD_PRICE = 19.99, DISCOUNT = 0.1, TAX = 0.13;
	int cd, dvd, totalBought;
	int customer = 0, totalCD = 0, totalDVD = 0;
	double cdCost, dvdCost, discountPrice, subtotal, tax, aftertax, totalSale = 0;
	char repeat = 'Y';

	// Rounds and formats prices
	DecimalFormat round = new DecimalFormat ("$#0.00");

	// Customer user input
	System.out.print ("~Orion Entertainment~ \nEnter customer? (Y/N) ");
	repeat = In.getChar ();

	// Loop repeats for multiple customers
	while (repeat == 'Y')
	{
	    // Keeps count of customer number
	    customer++;

	    // User input of cd and dvd values
	    System.out.print ("Enter number of CDs: ");
	    cd = In.getInt ();
	    if (cd < 0)
	    {
		System.out.print ("Please enter a postive integer for CDS: ");
		cd = In.getInt ();
	    }
	    System.out.print ("Enter number of DVDS: ");
	    dvd = In.getInt ();
	    if (dvd < 0)
	    {
		System.out.print ("Please enter a postive integer for DVDS: ");
		dvd = In.getInt ();
	    }

	    // Calculates total bought for discount, prices without tax/discount
	    totalBought = cd + dvd;
	    totalCD += cd;
	    totalDVD += dvd;
	    cdCost = cd * CD_PRICE;
	    dvdCost = dvd * DVD_PRICE;
	    subtotal = cdCost + dvdCost;

	    // Applies discount for total more than 10
	    if (totalBought >= 10)
	    {
		// Calculates discount and tax and total
		discountPrice = subtotal * DISCOUNT;
		subtotal = subtotal - discountPrice;
		tax = subtotal * TAX;
		aftertax = subtotal + tax;
	    }
	    else
	    {
		// Calculates tax and total
		discountPrice = 0;
		tax = subtotal * TAX;
		aftertax = subtotal + tax;
	    }

	    // Calculates daily sales
	    totalSale += aftertax;

	    // Outputs receipt for customers
	    System.out.println ("\n********************" + "\n~RECEIPT~"
		    + "\nCD x " + cd + " " + round.format (cdCost) + " "
		    + "\nDVD x " + dvd + " " + round.format (dvdCost)
		    + "\nDISCOUNT: " + round.format (discountPrice)
		    + "\nSUBTOTAL: " + round.format (subtotal)
		    + "\nTAX (13%): " + round.format (tax) + "\nTOTAL: "
		    + round.format (aftertax) + "\n********************");

	    // User input of customer entry
	    System.out.print ("\nEnter customer? (Y/N) ");
	    repeat = In.getChar ();
	}

	// Outputs total overall sales after customer entry loop is done
	System.out.print ("\n********************"
		+ "\nDAILY TOTAL~" + "\nTOTAL CUSTOMERS: " + customer
		+ "\nCD TOTAL: " + totalCD + "\nDVD TOTAL: " + totalDVD
		+ "\n$ALES: " + round.format (totalSale)
		+ "\n********************");

    }
}
