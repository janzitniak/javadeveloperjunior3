package sk.tmconsulting.dedicnost;

import java.util.ArrayList;
import java.util.List;

public class VozovyParkMain {
    public static void main(String[] args) {
        Auto auto1 = new Auto(); // vytvorili sme objekt (instanciu triedy) auto, nachadza sa v premennej auto1
        auto1.trubi("tuuuuuuuuuuuuu");
        auto1.setFarba("červená");
        auto1.setSpz("AA-001");
        auto1.setJeOsobne(true);
        auto1.akeSiVozidlo();
        auto1.setLuxusne(true);

        //System.out.println("Informácia o vozidle " + auto1);


        Motorka motorka1 = new Motorka();
        motorka1.trubi("tiiiiiiiiii");
        motorka1.setFarba("čierna");
        motorka1.setSpz("BA-001");
        motorka1.setJeOsobne(false);
        motorka1.akeSiVozidlo();
        motorka1.setLuxusne(false);


        System.out.println("\n");

        Vozidlo vozidlo3 = new Auto();
        Vozidlo vozidlo4 = new Motorka();

        vozidlo3.akeSiVozidlo();
        vozidlo4.akeSiVozidlo();



        System.out.println("\n");

        /* Polymorfizmus */
        List<Vozidlo> databazaVozidiel = new ArrayList<>();
        databazaVozidiel.add(auto1);
        databazaVozidiel.add(motorka1);

        for(Vozidlo konkretneVozidlo:databazaVozidiel) {
            konkretneVozidlo.akeSiVozidlo();
        }



        //System.out.println("Informácia o vozidle " + motorka1);



    }
}
