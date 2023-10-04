package schulverwaltungssoftware; 


public class Lehrer extends Menschen {
    private String name;
	private String fach;
	private int klassenstufe;
	private int alter;
	private int beitragsfaktor=5;
	

    public Lehrer(String name, int alter, String fach) {
		super(name,alter);
        this.fach = fach;
    }


}
