package tp2.ex2;

public class TestPoint {

    public static void main(String[] args) {
        Point p1 = new Point("a", 2.5);

        p1.affiche();
        p1.translate(2.5);
        p1.affiche();
    }
}
