package tp2.ex1;

public class TestTab {

    public static void main(String[] args) {
        int[] tab = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        double v = CalculT.moyenneT(tab);

        System.out.println("La moyenne est: " + v);

        CalculT.afficheT(tab);
    }
}
