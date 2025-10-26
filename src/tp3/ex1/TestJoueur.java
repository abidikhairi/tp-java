package tp3.ex1;

public class TestJoueur {

    public static void main(String[] args) {
        Joueur j1 = new Joueur("chebbi", "adam", 'H', 120);
        Joueur j2 = new Joueur("aouani", "sara", 'F', 50);

        Joueur.autoriser(j1, j2);
    }
}
