package ulohy;

import java.util.ArrayList;

public class DatabazaKnih {
    public static void main(String[] args) {
        Kniha kniha1 = new Kniha();
        kniha1.setNazov("Já, robot");
        kniha1.setAutor("Isaac Asimov");
        kniha1.setPocetStran(200);

        Kniha kniha2 = new Kniha();
        kniha2.setNazov("Pán prsteňov");
        kniha2.setAutor("J.R.R.Tolkien");
        kniha2.setPocetStran(300);

        ArrayList<Kniha> kniznica = new ArrayList<Kniha>();
        kniznica.add(kniha1);
        kniznica.add(kniha2);

        // Vypiseme vsetky knihy z kniznice, teda cez for each
        for(Kniha konkretnaKniha:kniznica) {
            System.out.println(konkretnaKniha.getNazov());
            System.out.println(konkretnaKniha.getAutor());
            System.out.println(konkretnaKniha.getPocetStran());
        }





    }
}
