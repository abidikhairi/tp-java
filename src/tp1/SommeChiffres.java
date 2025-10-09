package tp1;

import java.util.Scanner;

public class SommeChiffres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donner un entier positif");

        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Erreur: " + n + " n'est pas un entier positif");
            System.exit(1);
        }
        int s = 0;
        while (n != 0) {
            int r = n % 10;
            n = n / 10;

            s += r;
        }

        System.out.println("La somme des chiffres de " + n + " est " + s);
    }
}
