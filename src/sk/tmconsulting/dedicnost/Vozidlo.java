package sk.tmconsulting.dedicnost;
/* Toto je trieda rodica */
public class Vozidlo extends SuperVozidlo {
    private boolean jeOsobne;
    private String spz;
    private String farba;
    private int pocetKolies;
    private final int POCET_SEDADIEL = 0; /* final reprezentuje konstantu, cize neda sa prepisat */

    public boolean isJeOsobne() {
        return jeOsobne;
    }

    public void setJeOsobne(boolean jeOsobne) {
        this.jeOsobne = jeOsobne;
    }

    public String getSpz() {
        return spz;
    }

    public void setSpz(String spz) {
        this.spz = spz;
    }

    public String getFarba() {
        return farba;
    }

    public void setFarba(String farba) {
        this.farba = farba;
    }

    public int getPocetKolies() {
        return pocetKolies;
    }

    public void setPocetKolies(int pocetKolies) {
        this.pocetKolies = pocetKolies;
    }

    public void akeSiVozidlo() {
/*        if (this instanceof Auto ) {
            System.out.println("Som Auto");
        } else if (this instanceof Motorka) {
            System.out.println("Som Motorka");
        }*/
        System.out.println("Som vozidlo bez zaradenia");
    }

    public void trubi(String zvukovyPrejav) {
/*        if (this instanceof Auto ) {
            System.out.println("Metóda bola volaná z triedy Auto");
        } else if (this instanceof Motorka) {
            System.out.println("Metóda bola volaná z triedy Motorka");
        }*/
        System.out.println("Vozidlo sa prejavuje týmto zvukom " + zvukovyPrejav);
    }

    public void kolkoSedadielMas(int pocetSedadiel) {
        System.out.println("Vytvoril som vozidlo a počet sedadiel je: " + pocetSedadiel);
    }

    @Override
    public String toString() {
        return "Vozidlo{" +
                "jeOsobne=" + jeOsobne +
                ", spz='" + spz + '\'' +
                ", farba='" + farba + '\'' +
                ", pocetKolies=" + pocetKolies +
                ", POCET_SEDADIEL=" + POCET_SEDADIEL +
                '}';
    }
}
