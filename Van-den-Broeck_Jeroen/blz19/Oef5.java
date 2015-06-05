public class Oef5{
	public static void main(String[] args) {
		for(int a = 3; a<101; a++)
		{
			boolean priemgetal = true;
			for(int b = 2; b<a; b++)
			{
				if(a%b == 0)
				{
					priemgetal = false;
				}
			}
			if(priemgetal)
			{
				System.out.println(a);
			}
		}
	}
}