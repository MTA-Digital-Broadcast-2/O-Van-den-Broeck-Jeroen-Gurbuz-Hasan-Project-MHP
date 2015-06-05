public class Werknemer
{
	public String voornaam;
	public String achternaam;
	public int werknemerNummer;
	protected float salaris;
	private float RSZPercentage;

	public Werknemer(String voornaam, String achternaam, int wNummer, float salaris)
	{
		this.voornaam = voornaam;
		this.achternaam = achternaam;
		this.werknemerNummer = wNummer;
		this.salaris = salaris;
		this.RSZPercentage = 33;
	}

	public void salarisVerhogen(int percentage)
	{
		float verhogingsfactor = (float) percentage / 100;
		salaris += salaris * verhogingsfactor;
	}

	public float getSalaris()
	{
		return salaris;
	}

	public void setRSZ(float RSZ)
	{
		this.RSZPercentage = RSZ;
	}

	public float getRSZ()
	{
		return this.RSZPercentage;
	}
}