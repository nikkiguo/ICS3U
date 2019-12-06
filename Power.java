public class Power
{
    public static void main (String[] args)
    {
	// Declare variables for integer value and power
	int value;
	int power = 0;

	// User input of value
	System.out.print ("Enter a positive integer (zero to stop): ");
	value = In.getInt ();

	// while loop to repeat program
	do
	{
	    if (value < 0)
	    {
		System.out.print ("Enter a positive integer, not a negative number (zero to stop): ");
		value = In.getInt ();
	    }
	    else
	    {
		while (Math.pow (2, power) < value)
		{
		    power++;
		}
		// Output of smallest power greater or equal to value
		System.out.println ("Smallest power: " + "2" + "^" + power);
		power = 0;
		System.out.print ("Enter a positive integer (zero to stop): ");
		value = In.getInt ();
	    }

	}
	while (value != 0);
    }
}


