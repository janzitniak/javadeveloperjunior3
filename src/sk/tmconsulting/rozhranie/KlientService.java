package sk.tmconsulting.rozhranie;

public class KlientService implements IKlientPrototyp {

    @Override
    public int akoCastoNavstevujeDanuSluzbu() {
        return 0;
    }

    @Override
    public boolean jePocitacovoGramotny() {
        return false;
    }

    @Override
    public void zobrazOsobneUdaje(Klient klient) {
        System.out.println(klient);
    }

}
