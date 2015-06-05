public class PartTimeWerknemer extends Werknemer
{
	public int urenGewerkt;

	public PartTimeWerknemer ( String voornaam, String achternaam, int nr, float sal, int urengw )
	{
		super(voornaam, achternaam, nr, sal);
		this.urenGewerkt = urengw;
	}

	public float getWeekLoon()
	{
		return this.salaris * (float) this.urenGewerkt;
	}

	public void salarisVerhogen(int percentage)
	{
		if (percentage>5)
		{
			percentage = -20;
			System.out.println("nenenee, ni meer dan 5% voor " + this.voornaam);
		} 
		
			super.salarisVerhogen(percentage);
		
	}
}