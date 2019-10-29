/* Write a program that asks the user for a radius and calculates
 * the area and circumference, with each stored in a variable. */

import java.text.*;

public class Area
{
    public static void main (String[] args)
    {

	// Declare variables for area and circumference calculation
	double radius;
	double radiusSqaured;
	double area;
	double circumference;

	// Round values to two decimal places when necessary
	DecimalFormat round = new DecimalFormat ("###.##");

	// User input of circle radius
	System.out.print ("What is the radius of the circle? ");
	radius = In.getDouble ();

	// Use radius input to calculate radius sqaured
	radiusSqaured = Math.pow (radius, 2);

	// Calculate area of circle using PI constant and radius squared
	area = (Math.PI * radiusSqaured);

	// Calculate circumference of circle using PI constant and radius
	circumference = (2 * Math.PI * radius);

	// Output of area and circumference
	System.out.println ("\nArea of circle -> " + round.format (area) + " units squared");
	System.out.println ("Circumference of circle -> " + round.format (circumference) + " units");

    }
}
