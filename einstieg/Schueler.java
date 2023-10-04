package einstieg;

public class Schueler extends Personen {
    private int note;
    private double notenschnitt;

    public Schueler() {
        super();
    }

    public Schueler(String name, String gebDat, int gehalt, Adresse adresse, int note, double notenschnitt) {
        super(name, gebDat, gehalt, adresse);
        this.note = note;
        this.notenschnitt = notenschnitt;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public double getNotenschnitt() {
        return notenschnitt;
    }

    public void setNotenschnitt(double notenschnitt) {
        this.notenschnitt = notenschnitt;
    }

    @Override
    public String toString() {
        return super.toString() + " Hat die Note " + note + " und den Schnitt von " + notenschnitt;
    }
}
