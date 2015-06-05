public class Oef6{
	public static void main(String[] args) {
		
		int a[] = {12,34,56,78,123,234,99,88};
		int hoogsteGetal = a[0];
		for(int i = 0; i<a.length; i++)
		{
			if(hoogsteGetal<a[i])
			{
				hoogsteGetal = a[i];
			}
		}
		System.out.print(hoogsteGetal);
	}
}