package opakovanie.dedicnost;

public class EncyklopediaZvieratMain {
    public static void main(String[] args) {
        System.out.println("DELFÍN");
        Delfin delfin = new Delfin();
        delfin.hybeSa();
        delfin.sajeMlieko();
        System.out.println(delfin.JE_TEPLOKRVNY);
        System.out.println(delfin.MA_SRST);

        System.out.println("\nVLK");
        Vlk vlk = new Vlk();
        vlk.hybeSa();
        vlk.sajeMlieko();
        System.out.println(vlk.JE_TEPLOKRVNY);
        System.out.println(vlk.MA_SRST);
    }
}
