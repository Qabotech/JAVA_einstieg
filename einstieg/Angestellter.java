package einstieg; 


import einstieg.Adresse;

public class Angestellter extends Mitarbeiter {
    private double gehalt;
    private double zulage;

    public Angestellter(String name, Adresse adresse, double gehalt, double zulage) {
        super(name, adresse);
        this.gehalt = gehalt;
        this.zulage = zulage;
    }
    @Override
    public double berechneEntgelt() {
        return gehalt + zulage;
    }
}
