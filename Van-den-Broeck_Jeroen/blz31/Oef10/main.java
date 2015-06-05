public class main
{
	public static Werknemer[] werknemers;
	public static Faktuur[] fakturen;

	public static void main(String[] args) 
	{
		werknemers = new Werknemer[6];
		werknemers[0] = new Werknemer("Didier", "De Maeyer", 1, 1000000);
		werknemers[1] = new Werknemer("Jeroen", "Van den Broeck", 2, 9000000);
		werknemers[2] = new Werknemer( "Jim" , "Peeters" , 3 , 1000 );
		werknemers[3] = new Werknemer("bram", "bonte", 4, 3000);
		werknemers[4] = new PartTimeWerknemer("Matthias", "Van den Broeck", 5, 15, 20);
		werknemers[5] = new StudentenWerknemer("Mickel", "Van de Brande", 6, 20, 15);

		fakturen = new Faktuur[3];
		fakturen[0] = new Faktuur(1, 500);
		fakturen[1] = new Faktuur(2, 3000);
		fakturen[2] = new Faktuur(3, 50);

		werknemers[0].salarisVerhogen(10);
		werknemers[1].salarisVerhogen(10);
		werknemers[1].setRSZ(0);
		werknemers[4].setRSZ(5);

		//eersteFaktuur.betaal();
		betaalAlles();

		
	}

	public static void betaalAlles()
	{	
		Betaalbaar[] objecten = new Betaalbaar[werknemers.length + fakturen.length];
		for (int i = 0; i<werknemers.length; i++)
		{
			objecten[i] = werknemers[i];
		}
		for (int i = 0; i<fakturen.length; i++)
		{
			objecten[i + werknemers.length] = fakturen[i];
		}

		for (Betaalbaar object : objecten ) {
			object.betaal();
		}
	}
}