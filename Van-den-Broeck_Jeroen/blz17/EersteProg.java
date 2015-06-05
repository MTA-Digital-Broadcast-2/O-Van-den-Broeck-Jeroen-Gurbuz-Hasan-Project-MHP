import java.lang.*;
/**
* Deze klasse is een java programma
* @author Jeroen Van den Broeck
*/
public class EersteProg {
	/**
	*deze methode is de main mathode
	*@param args Dit zijn de command line parameters
	*/

	public static void main(String args[])
		{
		drukaf(100);
		}

	
	private static void drukaf(int m)
	{
		System.out.println(~10);
		// ~: elke bit wisselt inclusief de tekenbit
		// bij het 2's complement zorgt dit voor het tegengestelde van het getal-1 (je moet er telkens 1 bijtellen om de tegengestelde waarde te bekomen)
	}
}