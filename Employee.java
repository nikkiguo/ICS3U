import java.text.*;

public class Employee
{
    public static void main (String[] args)
    {
	// Declare all variables and constants
	String lastName, firstName;
	double hourlyPay = 0, grossPay = 0,
	    afterTax = 0, afterDonate = 0, tax = 0;
	int hoursWorked;
	final double OVERHOUR = 40, OVERPAY = 2;
	char taxCat, unitedWay;
	final double TAXA = 0, TAXB = 0.1,
	    TAXC = 0.2, TAXD = 0.29, TAXE = 0.35, DONATE = 20.0;

	DecimalFormat round = new DecimalFormat ("$#.00");

	// User input of pay information
	System.out.print ("Enter last name: ");
	lastName = In.getString ();

	System.out.print ("Enter first name: ");
	firstName = In.getString ();

	System.out.print ("Enter hourly pay: ");
	hourlyPay = In.getDouble ();

	System.out.print ("Enter hours worked: ");
	hoursWorked = In.getInt ();

	System.out.print ("Enter tax category (A to E): ");
	taxCat = In.getChar ();

	System.out.print ("Donate $20 to United Way? (Y/N): ");
	unitedWay = In.getChar ();

	// Evaluates if overtime pay is needed based on input
	if (hoursWorked >= OVERHOUR)
	{
	    grossPay = (((hoursWorked - OVERHOUR) * (OVERPAY * hourlyPay))
		    + (OVERHOUR * hourlyPay));
	}
	else
	{
	    grossPay = (hourlyPay * hoursWorked);
	}

	// Evaluates if donation is paid, calculates new pay
	if (unitedWay == 'Y')
	{
	    afterDonate = grossPay - DONATE;

	}
	else
	{
	    afterDonate = grossPay;
	}

	// Calculates tax based on catergory and after tax
	switch (taxCat)
	{
	    case 'A':
		tax = afterDonate * TAXA;
		afterTax = afterDonate - tax;
		break;
	    case 'B':
		tax = afterDonate * TAXB;
		afterTax = afterDonate - tax;
		break;
	    case 'C':
		tax = afterDonate * TAXC;
		afterTax = afterDonate - tax;
		break;
	    case 'D':
		tax = afterDonate * TAXD;
		afterTax = afterDonate - tax;
		break;
	    case 'E':
		tax = afterDonate * TAXE;
		afterTax = afterDonate - tax;
		break;
	    default:
		break;

	}

	// Output of tax, gross pay, hours worked/pay, name, donation, net pay
	System.out.println ("\nEmployee Name: " + firstName + " " + lastName
		+ "\nHourly Rate: " + round.format (hourlyPay)
		+ "\nNumber of hours worked: " + hoursWorked
		+ "\nGross Pay before Deduction: " + round.format (grossPay)
		+ "\nGross Pay after United Way contribution: "
		+ round.format (afterDonate) + "\nTax deduction: "
		+ round.format (tax) + "\nNet pay: "
		+ round.format (afterTax));
    }
}
