package datumy;

import java.time.LocalDate;
import java.util.ArrayList;

public class RozsahDatumu {
    public static void main(String[] args) {
        // Predpokladajme, že máme ArrayList s dátumami
        ArrayList<LocalDate> datumy = new ArrayList<>();
        datumy.add(LocalDate.of(2023, 5, 10));
        datumy.add(LocalDate.of(2023, 5, 15));
        datumy.add(LocalDate.of(2023, 5, 20));
        datumy.add(LocalDate.of(2023, 5, 25));
        datumy.add(LocalDate.of(2023, 5, 30));

        // Definovanie rozsahu dátumu "od" a "do"
        LocalDate datumOd = LocalDate.of(2023, 5, 15);
        LocalDate datumDo = LocalDate.of(2023, 5, 25);

        // Prechádzanie cez ArrayList a výpis údajov v danom rozsahu
        for (LocalDate datum : datumy) {
            if (datum.isAfter(datumOd) && datum.isBefore(datumDo)) {
                System.out.println(datum);
            }
        }
    }
}
