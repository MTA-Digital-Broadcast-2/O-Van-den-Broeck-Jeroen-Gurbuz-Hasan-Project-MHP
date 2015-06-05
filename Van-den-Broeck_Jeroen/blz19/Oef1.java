public class Oef1{
	public static void main(String args[]){
		for(int i = 1; i<10; i++)
		{
			for(int j = 1; j<10; j++)
			{
				if(i == 9 && j==9){
					System.out.print(i + "x" + j + "=" + i*j + ".");
				} else {
					System.out.print(i + "x" + j + "=" + i*j + ", ");
				}
				
			}
		}
	}
}