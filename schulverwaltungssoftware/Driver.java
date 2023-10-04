package schulverwaltungssoftware;


public class Driver {
    public static void main(String[] args) {
		Schueler tobi = new Schueler("Tobi", 21, 12);
		Schueler omar = new Schueler("Omar", 20, 11);
		Schueler donik = new Schueler("Donik", 17, 11);
		Lehrer Mark = new Lehrer("Mark", 21, "iuk");
		
		
		Menschen[] klassendiagramm = new Menschen[4];
		klassendiagramm[0]=tobi;
		klassendiagramm[1]=omar;
		klassendiagramm[2]=donik;
		klassendiagramm[3]=Mark;
		for (Menschen menschen: klassendiagramm)
		{
			System.out.println(menschen.getName() + "'s jaehrlichebeitrag: " + menschen.jaehrlichebeitrag(menschen.getKlassenstufe()) + " Euro");
		}
	
	
	
	}
}