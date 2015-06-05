public class Oef2{
	public static void main(String args[]){
		int dagGetal = 7;
		for(int i=1; i<29; i++)
		{
			if(dagGetal>7)
			{
				dagGetal = 1;
			}
			String dag = dag(dagGetal);
			System.out.println(dag+ " " + i + " februari");
			dagGetal ++;
		}
	}

	private static String dag(int dagGetal){
		String dag;
		switch(dagGetal)
		{
			case 1:
				dag = "maandag";
				break;
			case 2:
				dag = "dinsdag";
				break;
			case 3:
				dag = "woensdag";
				break;
			case 4:
				dag = "donderdag";
				break;
			case 5:
				dag = "vrijdag";
				break;
			case 6:
				dag = "zaterdag";
				break;
			case 7:
				dag = "zondag";
				break;
			default:
				dag = "dit is geen dag";
				break;
		}
		return dag;
	}
}