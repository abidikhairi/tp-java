package tp3.ex2;

import java.util.Calendar;

public class Personne {

    public String nom;
    public String prenom;
    public char sexe;
    public int annnee_nais;
    public String etatc;
    public boolean conjoint;

    public Personne(String nom, String prenom, char sexe, int
            annnee_nais, String etatc, boolean conjoint) {
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.annnee_nais = annnee_nais;
        this.etatc = etatc;
        this.conjoint = conjoint;
    }

    public void retourneInfos() {
        if (this.sexe == 'H')
            System.out.println("M. " + this.nom + " " + this.prenom + " est né en " + this.annnee_nais + ", il est " + this.etatc);

        else {
            if (this.etatc.equals("célibataire"))
                System.out.println("Mlle. " + this.nom + " " + this.prenom + " est née en " + this.annnee_nais + " elle est célibataire");

            else
                System.out.println("Mme. " + this.nom + " " + this.prenom + " est née en " + this.annnee_nais + " elle est " + this.etatc);

        }
    }

    public int age() {
        Calendar c = Calendar.getInstance();
        int anneeCourante = c.get(Calendar.YEAR);

        return anneeCourante - annnee_nais;
    }

    public void marier(Personne p1) {
        if ((this.age() >= 18) && (p1.age() >= 18)) {
            if (this.sexe != p1.sexe) {
                if ((this.conjoint == false) && (p1.conjoint == false) && (p1.sexe == 'H')) {
                    p1.etatc = "marié";
                    p1.conjoint = true;
                    this.etatc = "mariée";
                    this.conjoint = true;
                    this.nom = p1.nom + this.nom;
                } else if ((this.conjoint == false) && (p1.conjoint == false) && (p1.sexe == 'F')) {
                    this.etatc = "marié";
                    this.conjoint = true;
                    p1.etatc = "mariée";
                    p1.conjoint = true;
                    p1.nom = this.nom + p1.nom;
                } else {
                    System.out.println("Impossible de marier 2 personnes déjà mariées !");
                }
            } else {
                System.out.println("Impossible de marier 2 personnes de Même sexe !");
            }
        } else {
            System.out.println("Impossible de marier 2 personnes qui ne sont pas majeurs !");

        }
    }
}
