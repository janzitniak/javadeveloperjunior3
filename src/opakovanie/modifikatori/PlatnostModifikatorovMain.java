package opakovanie.modifikatori;

public class PlatnostModifikatorovMain {
    public static void main(String[] args) {
        PlatnostModifikatorov pm = new PlatnostModifikatorov(); /* Aby sme pristupovali k metodam a atributom (fields, premennym) tak musime dany objekt vytvorit */
        System.out.println(pm.protectedText);
        System.out.println(pm.publicText);
        System.out.println(pm.text);
    }
}
