package tp5;

public class Voiture extends Vehicule {

    int nbrPlaces;

    public Voiture(String immat, int anneeModele, String modele, String marque, int nbrPlaces) {
        super(immat, anneeModele, modele, marque);
        this.nbrPlaces = nbrPlaces;
    }

    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("Nbr Place: " + this.nbrPlaces);
        System.out.println("=====================");
    }
}
