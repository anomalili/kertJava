package nezet;

import java.util.List;
import modell.Kert;
import modell.Növény;

public class KertNézet {

    public static void main(String[] args) {
        Kert kert = new Kert();

        letrehoz(kert);
        beszerez(kert);
        eladas(kert);
        mentes(kert);
        beolvas(kert);
        szovegeski(kert);
        szovegesbe(kert);
        statisztika(kert);
        frissites(kert);
//        ellenorzes(kert);

    }

    private static void letrehoz(Kert kert) {
        kert = new Kert();
        System.out.println("alap: ");
        kert.novenyOsszes();
    }

    private static void beszerez(Kert kert) {
        kert.novenyUj(new Növény("aa04", "pelda1", 1000, 1));
        kert.novenyUj(new Növény("aa05", "pelda2", 2000, 2));
        System.out.println("beszerez: ");
        kert.novenyOsszes();
    }

    private static void eladas(Kert kert) {
        List<Növény> növények = kert.novenyekGet();
        if (!növények.isEmpty()) {
            Növény eladottNövény = növények.get(0);
            kert.novenyEladas(eladottNövény);
        } else {
            System.out.println("Nincs mit eladni!");
        }
        System.out.println("eladás: ");
        kert.novenyOsszes();
    }

    private static void mentes(Kert kert) {
        kert.novenyekFajlbaMentese();
    }

    private static void beolvas(Kert kert) {
        kert.novenyeketBeolvasFajlbol();
    }

    private static void statisztika(Kert kert) {
        System.out.println("statisztika: ");
        List<Növény> növények = kert.novenyekGet();
        int növényekSzama = növények.size();
        double összár = 0;
        for (Növény növény : növények) {
            összár += növény.getPrice();
        }
        double átlagár = összár / növényekSzama;
        System.out.println("Statisztika:");
        System.out.println("Növények száma: " + növényekSzama);
        System.out.println("Átlagár: " + átlagár);

    }

    private static void frissites(Kert kert) {
        kert = new Kert();
        kert.novenyeketBeolvasFajlbol();
    }

    private static void ellenorzes(Kert kert) {
        if (kert != null) {
            System.out.println("Frissített állapot:");
            List<Növény> frissítettNövények = kert.novenyekGet();
            for (Növény növény : frissítettNövények) {
                System.out.println(növény.getName() + ", Ár: " + növény.getPrice());
            }
        }
    }

    private static void szovegeski(Kert kert) {
        kert.szovegesFajlbaIras();
    }

    private static void szovegesbe(Kert kert) {
        kert.szovegesBeolvasas();
    }
}
