import java.lang.*;

public class Oef3 
{

	public static void main(String args[])
	{

		double pi = 0;
		for(double i=0; i<=10000; i++)
		{
   			if(i%2 == 0) 
        			pi += -1 / ( 2 * i - 1);
    			else
        			pi += 1 / (2 * i - 1);
		}
		System.out.println(pi);

	}

}