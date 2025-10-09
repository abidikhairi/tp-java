package tp1;

import java.util.Scanner;

public class SommeDeuxEntier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Donner un entier 'a'");
        int a = scanner.nextInt();
        System.out.println("Donner un entier 'b'");
        int b = scanner.nextInt();

        int s = a + b;

        System.out.println("La somme " + a + " + " + b + " est " + s);
    }
}
