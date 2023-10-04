package einstieg;

public class Lehrer extends Personen {
    private String fach;
    private int stunden;

    public Lehrer() {
        super();
    }

    public Lehrer(String name, String gebDat, Adresse adresse, String fach, int stunden) {
        super(name, gebDat, 0, adresse); 
        this.fach = fach;
        this.stunden = stunden;
    }

    public String getFach() {
        return fach;
    }

    public void setFach(String fach) {
        this.fach = fach;
    }

    public int getStunden() {
        return stunden;
    }

    public void setStunden(int stunden) {
        this.stunden = stunden;
    }

    @Override
    public String toString() {
        return super.toString() + " Lehrt das Fach: " + fach + " und arbeitet " + stunden + " Stunden.";
    }
}
