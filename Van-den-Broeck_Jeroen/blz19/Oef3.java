public class Oef3{
	public static void main(String[] args) {
		float pi;
		float factor2 = 0;
		for(float i=0; i<10000; i++)
		{
			if(i%2 == 0)
			{
				factor2 += 1/(2*i+1);
			} else
			{
				factor2 -= 1/(2*i+1);
			}
		}
		pi = 4*factor2;
		System.out.print(pi);
	}
}