public class StudentenWerknemer extends PartTimeWerknemer
{
	public StudentenWerknemer(String voornaam, String achternaam, int nr, float sal, int urengewerkt)
	{
		super(voornaam, achternaam, nr, sal, urengewerkt);
		setRSZ(5);
	}
}