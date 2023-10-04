package einstieg;
public class Arbeiter extends Mitarbeiter {
    private double lohnStd;
    private int anzStd;

    public Arbeiter(String name, Adresse adresse, double lohnStd, int anzStd) {
        super(name, adresse);
        this.lohnStd = lohnStd;
        this.anzStd = anzStd;
    }



    @Override
    public double berechneEntgelt() {
        return lohnStd * anzStd;
    }
}
