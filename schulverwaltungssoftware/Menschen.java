package schulverwaltungssoftware; 


public  class Menschen {
    private String name;
	private int alter;
	public static int anzahl;
	private int id;
	private int klassenstufe;
	
	public  Menschen() 
	{
		id = ++anzahl;
    }
	
    public Menschen(String name, int alter) 
	{
        this.name = name;
        this.alter = alter;
		id = ++anzahl;
    }
	
	public String getName() {
       return name;
    }
	

	public double jaehrlichebeitrag (int klassenstufe)
	{
		return alter / (double) klassenstufe * 5;
	}
	

}
