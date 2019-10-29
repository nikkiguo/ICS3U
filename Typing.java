//Write a program to calculate the speed if the number of words typed, the number of errors and the time given.

public class Typing
{
    public static void main (String[] args)
    {
	// Declare variables
	int word;
	int error;
	int time;
	int speed;

	// Input of user typing information
	System.out.print ("How many words did you type? ");
	word = In.getInt ();

	System.out.print ("How many errors? ");
	error = In.getInt ();

	System.out.print ("How much time did you type, in minutes? ");
	time = In.getInt ();

	// Calculate speed based on user input
	speed = (word - 12 * error) / time;

	// Output of speed based on user information
	System.out.println ("\nWord -> " + word + "\nErrors -> " + error + "\nTime -> " + time + " minutes" + "\nYour speed -> " + speed + " words / minute");
    }
}




