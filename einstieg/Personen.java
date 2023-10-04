package einstieg;

public class Personen {
    private String name;
    private String gebDat;
    private double gehalt;
    private int personalnummer;
    private Adresse adresse;

    static int anzahl;

    public Personen() {
        personalnummer = anzahl++;
    }

    public Personen(String name) {
        this.name = name;
        anzahl++;
    }

    public Personen(String name, double gehalt) {
        this.name = name;
        this.gehalt = gehalt;
        anzahl++;
    }

    public Personen(String name, String gebDat, double gehalt) {
        this.name = name;
        this.gehalt = gehalt;
        this.gebDat = gebDat;
        anzahl++;
    }

    public Personen(String name, String gebDat, double gehalt, Adresse adresse) {
        this.name = name;
        this.gehalt = gehalt;
        this.gebDat = gebDat;
        this.adresse = adresse;
        anzahl++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getGehalt() {
        return gehalt;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    @Override
    public String toString() {
        return "Hallo, mein Name ist " + name + ", mein Geburtstag ist am " + gebDat +
               ", und ich verdiene " + gehalt + ". Meine Adresse ist " + adresse + ".";
    }
}
