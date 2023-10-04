package einstieg; 


import einstieg.Adresse;


public abstract class Mitarbeiter {
    private String name;
    private Adresse adresse;
    private double bonus;
	
	
	
	// to do :
	/*
		add id and change super so it uses ID instead of Name,Adresse
	*/
    public Mitarbeiter(String name, Adresse adresse) {
        this.name = name;
        this.adresse = adresse;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getName() { 
        return name;
    }
	
	public abstract double berechneEntgelt();  // abstract heißst alle UNTERKLASSEN benötigen DIESE Methode!!
	


	public double berechneEntgelt(double bouns)
	{
		return berechneEntgelt() + bonus;
	}
}
