package ulohy;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class VypisMaticuNasobky2 {
    public static void main(String[] args) {

        // Vypiseme aktualny cas
        String timeStampStart = new SimpleDateFormat("HH:mm:ss:SSSS").format(Calendar.getInstance().getTime());
        System.out.println(timeStampStart);

        // TODO Test efektivnosti kodu, resp. cyklu
        // RIESENIE: Na zaciatku kodu by som zobrazil, resp. naplnil premennu aktualnym casom
        // Na konci taktiez, resp. odpocital rozdiel trvania
        int j = 1;
        // Koncovu hodnotu navysime na velke cislo
        for (int i = 1; i <= 16384; i*=2) {
            System.out.print(i + " ");
            if (j % 5 == 0) System.out.println();
            j++;
        }

        // Vypiseme aktualny cas
        String timeStampEnd = new SimpleDateFormat("HH:mm:ss:SSSS").format(Calendar.getInstance().getTime());
        System.out.println(timeStampEnd);

        System.out.println("\n--------------------------\n");

        // Vypiseme aktualny cas
        String timeStampStart2 = new SimpleDateFormat("HH:mm:ss:SSSS").format(Calendar.getInstance().getTime());
        System.out.println(timeStampStart2);

        int san = 1;
        for (int i = 1; i <= 15; i++) {
            System.out.print(san + " ");
            san *= 2;
            if (i % 5 == 0) {
                System.out.println("");
            }
        }

        // Vypiseme aktualny cas
        String timeStampEnd2 = new SimpleDateFormat("HH:mm:ss:SSSS").format(Calendar.getInstance().getTime());
        System.out.println(timeStampEnd2);


    }
}
