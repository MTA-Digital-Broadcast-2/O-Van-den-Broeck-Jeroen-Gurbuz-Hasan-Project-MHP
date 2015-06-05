public class main
{
	public static void main(String[] args) 
	{
		Werknemer[] werknemers = new Werknemer[6];
		werknemers[0] = new Werknemer("Didier", "De Maeyer", 1, 1000000);
		werknemers[1] = new Werknemer("Jeroen", "Van den Broeck", 2, 9000000);
		werknemers[2] = new Werknemer( "Jim" , "Peeters" , 3 , 1000 );
		werknemers[3] = new Werknemer("bram", "bonte", 4, 3000);
		werknemers[4] = new PartTimeWerknemer("Matthias", "Van den Broeck", 5, 15, 20);
		werknemers[5] = new PartTimeWerknemer("Mickel", "Van de Brande", 6, 20, 15);

		werknemers[0].salarisVerhogen(10);
		werknemers[1].salarisVerhogen(10);

		for (Werknemer werknemer : werknemers ) {
			System.out.println(werknemer.voornaam + " (" + werknemer.werknemerNummer + ")");
		}
	}
}