package tp3.ex2;

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
}
