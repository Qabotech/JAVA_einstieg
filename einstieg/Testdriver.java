package einstieg;
import java.util.Scanner;

import einstieg.Adresse;
public class Testdriver {
    public static void main(String[] args) {

        Adresse adresse1 = new Adresse("Musterstraße 123", "Musterstadt", 12345);
        Adresse adresse2 = new Adresse("Testweg 456", "Teststadt", 67890);

        Arbeiter paul = new Arbeiter("Paul", adresse1, 17.20, 140);
        Angestellter kurt = new Angestellter("Kurt", adresse2, 4000.00, 500.00);
        Praktikant olga = new Praktikant("Olga", adresse1, 500.00);
        Chef otto = new Chef("Otto", adresse2, 7000.00);




        Mitarbeiter[] mitarbeiterArray = new Mitarbeiter[4];
        mitarbeiterArray[0] = paul;
        mitarbeiterArray[1] = kurt;
        mitarbeiterArray[2] = olga;
        mitarbeiterArray[3] = otto;





        for (Mitarbeiter mitarbeiter: mitarbeiterArray) {
            System.out.println(mitarbeiter.getName() + "'s Entgelt: " + mitarbeiter.berechneEntgelt() + " €");
        }


        System.out.println("-------------------");

        paul.setBonus(100.00);
        kurt.setBonus(5000);
        olga.setBonus(50.00);
        otto.setBonus(300.00);
        System.out.println("Version mit Überladung");
        for (Mitarbeiter mitarbeiter: mitarbeiterArray) {
            System.out.println(mitarbeiter.getName() + "'s Entgelt inklusive Bonus: " + mitarbeiter.berechneEntgelt(0) + " E");
        }
    }
}