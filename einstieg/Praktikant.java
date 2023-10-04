package einstieg; 


import einstieg.Adresse;

public class Praktikant extends Mitarbeiter {
    private double hungerlohn;
	private double gehalt;
	private double zulage;
	
    public Praktikant(String name, Adresse adresse, double hungerlohn) {
        super(name, adresse);
        this.hungerlohn = hungerlohn;
    }
    @Override
    public double berechneEntgelt() {
        return gehalt + zulage;
    }

}

