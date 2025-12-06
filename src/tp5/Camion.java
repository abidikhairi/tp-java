package tp5;

public class Camion extends Vehicule {
    double capacite;

    public Camion(String immat, int anneeModele, String modele, String marque, double capacite) {
        super(immat, anneeModele, modele, marque);
        this.capacite = capacite;
    }

    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("Capacite: " + capacite);
        System.out.println("=====================");
    }
}
