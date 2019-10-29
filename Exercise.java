public class Exercise
{
    public static void main (String[] args)
    {
	double bikeHours;
	double jogHours;
	double totalCalories;
	double pounds;

	System.out.print ("Number of hours on bicycle: ");
	bikeHours = In.getDouble ();

	System.out.print ("Number of hours jogging: ");
	jogHours = In.getDouble ();

	totalCalories = ((bikeHours * 300) + (jogHours * 600));
	pounds = (totalCalories / 1000);

	System.out.println ("Number of calories burned on both activities: " + totalCalories);
	System.out.println ("Number of pounds worked off: " + pounds);

    }
}
