import java.lang.*;

public class EersteProg 
{

	public static void main(String args[])
	{
		System.out.println(~10);
		/* dit geeft -11 omdat een int bestaat uit 32 bits
		00000000000000000000000000001010 = 10
		11111111111111111111111111110101 = ~10 = de 2's complement notatie van -11 */
	}

}