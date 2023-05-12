package sk.tmconsulting.rozhranie;

public interface IKlientPrototyp {
    int akoCastoNavstevujeDanuSluzbu(); /* Zistujeme pocet navstev danej sluzby */
    boolean jePocitacovoGramotny();
    void zobrazOsobneUdaje(Klient klient);
}
