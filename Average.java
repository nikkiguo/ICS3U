/* Write a program that asks the user to enter four course grades,
and then calculates and prints the average grade. */

import java.text.*;

public class Average
{
    public static void main (String[] args)
    {

	// Declare course grade and overall average variables
	double course1;
	double course2;
	double course3;
	double course4;
	double average;

	// Round values to two decimal places when necessary
	DecimalFormat round = new DecimalFormat ("##.##");

	// Get user input of each course grade
	System.out.print ("What is the grade(%) of course 1? ");
	course1 = In.getDouble ();

	System.out.print ("What is the grade(%) of course 2? ");
	course2 = In.getDouble ();

	System.out.print ("What is the grade(%) of course 3? ");
	course3 = In.getDouble ();

	System.out.print ("What is the grade(%) of course 4? ");
	course4 = In.getDouble ();

	// Calculate average based on input of couse grades
	average = (course1 + course2 + course3 + course4) / 4;

	// Output of overall average
	System.out.print ("\nYour average is " + round.format (average) + "%.");

    }
}
