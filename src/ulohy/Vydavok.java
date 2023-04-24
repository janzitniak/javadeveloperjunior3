package ulohy;

public class Vydavok {
    private String nazov;
    private double suma;
    private boolean jeOsobny;


    // Prazdny konstruktor
    public Vydavok() {
        this.nazov = "Chlieb";
        this.suma = 2.3;
        this.jeOsobny = true;
    }

    // Konstruktor
    public Vydavok(String nazov, double suma, boolean jeOsobny) {
        this.nazov = nazov;
        this.suma = suma;
        this.jeOsobny = jeOsobny;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        // aplikacna logika, ktora zmeni tu premennu
        this.nazov = nazov;
    }

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    public boolean isJeOsobny() {
        return jeOsobny;
    }

    public void setJeOsobny(boolean jeOsobny) {
        this.jeOsobny = jeOsobny;
    }
}
