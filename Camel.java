/* Create camel case given input of words*/
public class Camel
{
    public static void main (String[] args)
    {
	// Initialize and declare arrays and variables
	String[] input;
	String word;
	char repeat;
	
	// Loop to repeat program
	do
	{
	    // User input of words
	    System.out.println ("~ word to camelCase ~");
	    System.out.println ("Enter one or more words to camel case:");
	    input = In.getString ().split (" ");
	    
	    // Loop through words to capitalize start of words following first
	    for (int c = 0 ; c < input.length ; c++)
	    {
		word = input [c].toLowerCase ();
		for (int d = 0 ; d < word.length () ; d++)
		{
		    if (c > 0 && d == 0) /
		    {
			System.out.print (Character.toUpperCase
				(word.charAt (0)));
		    }
		    // Prints out lowercase letter for the rest of indexes
		    else 
		    {
			System.out.print (word.charAt (d));
		    }
		}
	    }
	    // Ask to repeat program
	    System.out.print ("\nRepeat? (y/n): ");
	    repeat = In.getChar ();
	}
	while (repeat == 'y' || repeat == 'Y');
    }
}
