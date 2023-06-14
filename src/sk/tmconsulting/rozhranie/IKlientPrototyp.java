package sk.tmconsulting.rozhranie;

public interface IKlientPrototyp {
    int akoCastoNavstevujeDanuSluzbu(Klient klient); /* Zistujeme pocet navstev danej sluzby */
    boolean jePocitacovoGramotny(Klient klient);
    void zobrazOsobneUdaje(Klient klient);
}
