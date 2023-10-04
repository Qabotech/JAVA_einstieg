package einstieg;
public class Chef extends Mitarbeiter {
    private double basisgehalt;
    public Chef(String name, Adresse adresse, double basisgehalt) {
        super(name, adresse);
        this.basisgehalt = basisgehalt;
    }
    @Override
    public double berechneEntgelt() {
        return basisgehalt;
    }
}
