package sk.tmconsulting.rozhranie;

public class Klient {
    private String meno;
    private String priezvisko;

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    @Override
    public String toString() {
        return "Klient{" +
                "meno='" + meno + '\'' +
                ", priezvisko='" + priezvisko + '\'' +
                '}';
    }
}
