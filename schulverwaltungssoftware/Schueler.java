package schulverwaltungssoftware; 


public class Schueler extends Menschen {
    private String name;
	private int klassenstufe;
	private int alter;
	private int beitragsfaktor=5;
	private double test=0;
    public Schueler(String name, int alter, int klassenstufe) {
		super(name,alter);
        this.klassenstufe = klassenstufe;
    }

	public int getKlassenstufe()
	{
		return klassenstufe;
	}
}
