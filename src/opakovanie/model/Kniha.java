package opakovanie.model;

public class Kniha {
    private String nazov;
    private String autor;
    private int rokVydania;

    // Konstruktor sluzi na inializaciu fields (udajov triedy, resp. atribúty, resp. premenne)
    public Kniha() {
        // Inicializacia objektu Kniha
        this.nazov = "-";
        this.autor = "-";
        this.rokVydania = 2000;
    }

    public Kniha(String nazov, String autor, int rokVydania) {
        this.nazov = nazov;
        this.autor = autor;
        this.rokVydania = rokVydania;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getRokVydania() {
        return rokVydania;
    }

    public void setRokVydania(int rokVydania) {
        this.rokVydania = rokVydania;
    }

    @Override
    public String toString() {
        return "Názov knihy: " + nazov + "\nAutor knihy: " + autor + "\nRok vydania: " + rokVydania;
    }
}
