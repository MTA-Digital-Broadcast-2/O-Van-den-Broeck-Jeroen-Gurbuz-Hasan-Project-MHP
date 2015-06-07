import java.lang.*;

public class Oef6 
{

	public static void main(String args[])
	{


                int a[] = new int[]{12,34,56,78,123,234,99,88};
                int max = a[0];
               
                for(int i=1; i< a.length; i++)
                {
                        if(a[i] > max)
			{
                                max= a[i];
			}
                       
                }
		System.out.println(max);
	}

}