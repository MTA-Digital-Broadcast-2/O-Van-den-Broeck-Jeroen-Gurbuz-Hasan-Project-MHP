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

	/**
	*deze methode drukt oplopend van 0 getallen af
	*@param m Dit is het aantal af te drukken getallen.
	*/
	private static void drukaf(int m)
	{
		int a=55;
		while(a>34)
		{
			System.out.println(a);
			a--;
		}
		
	}
}