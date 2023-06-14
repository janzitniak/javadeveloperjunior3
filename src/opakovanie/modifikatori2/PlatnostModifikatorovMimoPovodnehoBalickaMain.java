package opakovanie.modifikatori2;

import opakovanie.modifikatori.PlatnostModifikatorov;

public class PlatnostModifikatorovMimoPovodnehoBalickaMain extends PlatnostModifikatorov {
    public static void main(String[] args) {
        PlatnostModifikatorovMimoPovodnehoBalickaMain pmmpb = new PlatnostModifikatorovMimoPovodnehoBalickaMain();
        System.out.println(pmmpb.protectedText); /* Je dostupna iba premenna s modifikatorom protected, ale aj to len prostrednictvom dedenia */

        PlatnostModifikatorov pm = new PlatnostModifikatorov();
        System.out.println(pm.publicText);
    }
}
