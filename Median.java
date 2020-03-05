// Input: Marks Output: Mean, median, mode, frequency

import java.util.*;
import java.text.*;

public class Median
{
    public static void main (String[] args)
    {
	final int SENTINEL = -1;
	int input, count = 0, sum = 0, mean = 0, hold = 0, hold1 = 0, modecount;

	DecimalFormat round = new DecimalFormat ("##.##");

	System.out.println ("Enter number of entries: ");
	int num = In.getInt ();
	int mark[] = new int [num];
	int occurence[] = new int [11];

	// input
	for (int i = 0 ; i < mark.length ; i++)
	{
	    System.out.println ("Enter marks between 0 and 10, inclusive: ");
	    mark [i] = In.getInt ();

	    if (mark [i] < 0 || mark [i] > 10)
	    {
		System.out.println ("Marks should be in between 0 and 10, inclusive");
		mark [i] = In.getInt ();
	    }
	}

	// Frequency chart
	for (int j = 0 ; j <= 10 ; j++)
	{
	    count = 0;
	    for (int k = 0 ; k < num ; k++)
	    {
		if (j == mark [k])
		{
		    count++;
		}
		if (k == num - 1)
		{
		    occurence [j] = count;
		}
	    }
	    if (occurence [j] > hold)
	    {
		hold = occurence [j];
		hold1 = j;
	    }
	}
	System.out.println ("Mark" + "   |  " + "Frequency");
	System.out.println ("_______________________");

	for (int m = 0 ; m <= 10 ; m++)
	{
	    System.out.println (m + "      |        " + occurence [m]);
	}

	System.out.println ("Mode: " + hold1 + " occurs " + hold + " times.");

	// Sum and mean
	for (int j = 0 ; j < num ; j++)
	{
	    sum += mark [j];
	}
	mean = sum / num;
	System.out.println ("Sum: " + sum + "\nMean: " + mean);

	// Median
	Arrays.sort (mark);

	if (num % 2 != 0)
	{
	    System.out.print ("Median: " + mark [num / 2]);
	}
	else
	{
	    System.out.print ("Median: " + (mark [num / 3]) + " and " + (mark [num / 2]));
	    hold = num;
	}

    }
}
