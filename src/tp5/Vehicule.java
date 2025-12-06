package tp5;

public class Vehicule {

    String immat;

    int anneeModele;

    String modele;

    String marque;

    public Vehicule(String immat, int anneeModele, String modele, String marque) {
        this.immat = immat;
        this.anneeModele = anneeModele;
        this.modele = modele;
        this.marque = marque;
    }

    public void afficherInfos() {
        System.out.printf("[Immat = %s, Marque = %s, Modele = %s, AnneeModele = %d]\n", immat, marque, modele, anneeModele);
    }
}
