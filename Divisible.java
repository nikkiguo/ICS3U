public class Divisible
{
    public static void main (String[] args)
    {
	// Declare variables 
	int num = 1, start = 0, minus, digitSplit, repeat;
	String str;
	boolean ok = true, stop = false;

	// Asks user to start program
	System.out.print ("Run divisble by 11 program? Press 1 for 'yes' or 0 for 'no': ");
	repeat = In.getInt ();

	while (repeat == 1)
	{
	    do
	    {
		try
		{
		    // User input of number and bullet proof
		    System.out.println ("\nEnter a positive integer:");
		    str = In.getString ();
		    num = Integer.parseInt (str);
		    start = num;
		    stop = false;
		    ok = false;

		    // Bullet proof negative numbers and zero
		    if (num < 0)
		    {
			ok = true;
			System.out.println ("ERROR: Negative integer entered, try again.");
		    }
		    if (num == 0)
		    {
			ok = true;
			System.out.println ("ERROR: Zero entered, try again.");
		    }
		    
		}

		// Bullet proof string
		catch (NumberFormatException stringEntered)
		{
		    ok = true;
		    System.out.println ("ERROR: String entered, try again.");
		}
	    }
	    while (ok == true);

	    // Evaluates if number is divisble by 11 using Lewis Caroll's algorithm
	    while ((ok == false) && (stop == false))
	    {
		digitSplit = num / 10;
		minus = num % 10;
		num = digitSplit - minus;
		System.out.println (num);
		
		// Outputs if divisible or not
		if (num == 0)
		{
		    stop = true;
		    System.out.println (start + " is divisible by 11.");
		}
		else if (num < 0)
		{
		    stop = true;
		    System.out.println (start + " is not divisible by 11.");
		}
	    }
	    // Repeats program
	    System.out.print ("\nRun divisble by 11 program? Press 1 for 'yes' or 0 for 'no': ");
	    repeat = In.getInt ();

	}
    }
}

