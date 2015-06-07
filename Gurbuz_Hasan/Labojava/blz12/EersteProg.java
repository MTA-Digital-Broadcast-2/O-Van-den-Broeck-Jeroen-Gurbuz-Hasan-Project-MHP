import java.lang.*;

/**
* De klasse EersteProg is een Java applicatie
*
* @author Hasan Gurbuz
* @version 1.0
*/


public class EersteProg 
{

/**
* Dit is een main-functie, hier start het programma
* 
* @param args Dit is een array van strings waarmee parameters kunnen meegegeven worden vanaf de commandline.
*/

	public static void main(String args[])
	{
		drukaf(100);

	}

/**
* Dit is een methode genaamd drukaf
* 
* @param m hier wordt een getal ingegeven
*/

	public static void drukaf(int m)
	{
		int a;
		for (a=0; a<m; a++)
		{
			System.out.println(a);
		}

	}
}