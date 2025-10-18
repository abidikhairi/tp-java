package tp2.ex2;

public class Point {

    String nom;

    double abscisse;

    public Point() { }

    public Point(String nom, double abscisse) {

        this.nom = nom;
        this.abscisse = abscisse;
    }

    public void affiche() {
        System.out.println("Nom: " + this.nom + " Abscisse: " + this.abscisse);
    }

    public void translate(double dx) {
        this.abscisse = this.abscisse + dx;
    }
}
