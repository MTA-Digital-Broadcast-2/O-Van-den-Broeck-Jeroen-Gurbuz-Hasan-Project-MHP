public class main
{
	public static void main(String[] args) 
	{
		Werknemer Didier = new Werknemer("Didier", "De Maeyer", 1, 1000000);
		Werknemer Jeroen = new Werknemer("Jeroen", "Van den Broeck", 2, 9000000);
		Werknemer Jim = new Werknemer( "Jim" , "Peeters" , 3 , 1000 );
		Werknemer Bonte = new Werknemer("bram", "bonte", 4, 3000);

		Didier.salarisVerhogen(10);
		Jeroen.salarisVerhogen(10);

		System.out.println(Didier.voornaam + ": " + Didier.getSalaris());
		System.out.println(Jeroen.voornaam + ": " + Jeroen.getSalaris());
		System.out.println(Jim.voornaam + ": " + Jim.getSalaris());
		System.out.println(Bonte.voornaam + ": " + Bonte.getSalaris());
	}
}