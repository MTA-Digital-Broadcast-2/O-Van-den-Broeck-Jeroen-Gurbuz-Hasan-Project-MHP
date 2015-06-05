public class Oef7{
	public static void main(String[] args) {
		int a[] = {12,34,56,78,123,234,99,88};
		int[] b = new int[8];
		for(int i = 0; i<b.length; i++)
		{
			int hoogsteGetal = 0;
			int getalPlaats = 0;
			for(int j = 0; j<a.length; j++)
			{
				if(a[j] > hoogsteGetal)
				{
					hoogsteGetal = a[j];
					getalPlaats = j;
				}
			}
			b[i] = hoogsteGetal;
			a[getalPlaats] = 0;
		}
		for(int i = 0; i<b.length; i++)
		{
			System.out.println(b[i]);
		}
	}
}