// Gives sum based on values of digits inputed 

public class Digits
{
    public static void main (String[] args)
    {
	// Declare and initialize variables
	String input;
	int output = 0, hold = 0;
	char go = 'n';

	do // Loop to repeat the program
	{
	    output = 0;
	    hold = 0;

	    // User input of integers
	    System.out.println ("Enter integer number:");
	    input = In.getString ();

	    // Parses char to int, evaluate if more or less, prints calculation
	    for (int i = 0 ; i < input.length () ; i++)
	    {
		if (hold <= Character.getNumericValue (input.charAt (i)))
		{
		    hold = Character.getNumericValue (input.charAt (i));
		    output += hold;
		    if (i == 0)
		    {
			System.out.print (input.charAt (i));
		    }
		    else
		    {
			System.out.print (" + " + input.charAt (i));
		    }
		}
		else if (hold > Character.getNumericValue (input.charAt (i)))
		{
		    hold = Character.getNumericValue (input.charAt (i));
		    output -= Character.getNumericValue (input.charAt (i));
		    if (i == 0)
		    {
			System.out.print (input.charAt (i));
		    }
		    else
		    {
			System.out.print (" - " + input.charAt (i));
		    }
		}
	    }
	    System.out.println (" | Output: " + output);  // Output of total
	    // Asks to repeat the program
	    System.out.print ("Repeat (y/n): ");
	    go = In.getChar ();
	}
	while (go == 'Y' || go == 'y');
    }
}
