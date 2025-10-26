package tp3.ex1;

public class Joueur {

    public String nom;

    public String prenom;

    public char sexe;

    public int nbParties;

    public Joueur(String nom, String prenom, char sexe, int nbParties) {

        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.nbParties = nbParties;
    }

    public static void autoriser(Joueur j1, Joueur j2) {
        if (j1.sexe != j2.sexe) {
            System.out.println("Non autorisés: Joueurs de sexe différents");
        } else if ((j1.nbParties > 100 && j2.nbParties <= 100) || (j2.nbParties > 100 && j1.nbParties <= 100) ) {
            System.out.println("Non autorisés: Joueurs de niveau différents");
        } else {
            System.out.println("Autorisés");
        }
    }
}
