package tp2.ex1;

public class CalculT {

    public static int sommeT(int[] tab) {
        int s = 0;
        for (int i = 0; i < tab.length; i++) {
            s += tab[i];
        }

        return s;
    }

    public static int produitT(int[] tab) {
        int p = 1;

        for (int i = 0; i < tab.length; i++) {
            p *= tab[i];
        }

        return p;
    }

    public static double moyenneT(int[] tab) {
        int s = sommeT(tab);

        return (double) s / tab.length;
    }

    public static void afficheT(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.println("Tab[" + i + "] = " + tab[i]);
        }
    }
}
