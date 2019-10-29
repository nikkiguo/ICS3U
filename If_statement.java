public class If_statement
{
    public static void main (String[] args)
    {
	// Declare all variables and constants
	double income, houseCost, tax18, tax15 = 0,
	    afterTax = 0, grandTotal = 0, refund = 0;
	int totalChildren, noSchoolChildren, schoolChildren, deduction = 0;
	final double SURTAX = 0.15, TAX = 0.18;
	final double HOUSE = 8000, HOUSEREDUCE = 10000, TAXPAYABLE = 2000,
	    HOUSEPRICE = 6000;
	final int CHILD = 500, SCHOOLCHILD = 1000;
	final int TOTALCHILDREN = 2, SCHOOLCHILDREN = 1, ZERO = 0,
	    REFUND = -1;

	// User input of information
	System.out.print ("Enter income: $");
	income = In.getDouble ();
	System.out.print ("Enter house cost: $");
	houseCost = In.getDouble ();
	System.out.print ("Enter number of children: ");
	totalChildren = In.getInt ();
	System.out.print ("Enter number of children in school: ");
	schoolChildren = In.getInt ();

	// Evaluates tax based on house cost and income
	if ((houseCost < HOUSE) && (income < HOUSEREDUCE))
	{
	    tax18 = ZERO;
	}
	else if (houseCost >= HOUSE)
	{
	    tax18 = income * TAX;
	}
	else
	{
	    tax18 = (income - HOUSEREDUCE) * TAX;
	}

	// Calculates child deduction based on number of children
	noSchoolChildren = totalChildren - schoolChildren;
	deduction = (noSchoolChildren * CHILD)
	    + (schoolChildren * SCHOOLCHILD);
	afterTax = tax18 - deduction;

	// Evalulates if tax is over $2000 for surtax
	if (afterTax > TAXPAYABLE)
	{
	    tax15 = afterTax * SURTAX;
	    grandTotal = tax15 + afterTax;
	}
	// Tax refunds depending on children in school. house price
	else if (afterTax < ZERO)
	{
	    if ((houseCost < HOUSEPRICE) && (totalChildren >= TOTALCHILDREN)
		    && (schoolChildren >= SCHOOLCHILDREN))
	    {
		refund = afterTax * REFUND;
		grandTotal = ZERO;
	    }
	}
	// No surtax if less than $2000 and no tax refund
	else
	{
	    grandTotal = afterTax;
	}

	// Output of tax receipt statement
	System.out.println ("\n~TAX RECEIPT~" + "\nIncome: $"
		+ income + "\nHouse Cost: $" + houseCost
		+ "\nTotal Children: " + totalChildren + "\nSchool: "
		+ schoolChildren + "\nTax (18%) $" + tax18 + "\nDeduction: $"
		+ deduction + "\nSurtax: (15%) $" + tax15
		+ "\nTax (Payable): $" + grandTotal + "\nRefund: $" + refund);
    }
}
