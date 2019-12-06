public class Total
{
    public static void main (String[] args)
    {
	char repeat;
	int count = 0;
	int value, total = 0, min = 0, max = 0, number = 0;
	double average;

	// User input of integer
	System.out.print ("Would you like to enter an integer (Y/N): ");
	repeat = In.getChar ();

	// Repeats for entering multiple numbers
	while (repeat == 'Y' || repeat == 'y' || repeat == 'R' || repeat == 'r')
	{
	    // Resets program to calculate new min, max, average, total
	    if (repeat == 'R' || repeat == 'r')
	    {
		count = 0;
		total = 0;
	    }

	    // User input of integers, calculates total, number of integers entered
	    System.out.print ("Enter an integer: ");
	    number = In.getInt ();
	    total = number + total;
	    count++;

	    // Determines min and max number based on others entered
	    if (count == 1)
	    {
		min = number;
		max = number;
	    }
	    else
	    {
		if (number > max)
		    max = number;

		if (number < min)
		    min = number;
	    }

	    // Calculates average and outputs min, max, total, and average
	    average = total / count;
	    System.out.println ("Min: " + min + " Max: " + max
		    + " Total: " + total + " Average: " + average);

	    // Repeats, stops, or resets program based on user input
	    System.out.print ("Would you like to enter an integer (Y/N/R): ");
	    repeat = In.getChar ();
	}
    }
}
