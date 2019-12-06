import java.text.*;

public class Temp
{
    public static void main (String[] args)
    {
	// Declare variables and constants
	int fahrenheit, celsius;
	// Add degree symbol
	DecimalFormat degree = new DecimalFormat ("##°");
	
	System.out.println ("Celsius | Fahrenheit");

	// Print and calculate conversions for values up to 100 degrees C
	for (celsius = 0 ; celsius <= 100 ; celsius += 10)
	{
	    // Caculates farenheit values
	    fahrenheit = ((celsius * 9 / 5) + 32);
	    // Chart output
	    System.out.println ("____________________"
		    + "\n    " + degree.format (celsius) + "     " + degree.format (fahrenheit));
	}

    }
}
