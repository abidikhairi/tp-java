package tp5;

import java.util.Vector;

public class Parc {

    Vector<Vehicule> vehicules;
    int nbr;
    static int MAX = 20;

    public Parc() {
        this.vehicules = new Vector<>(MAX);
        this.nbr = 0;
    }

    public void  addVehicule(Vehicule v) {
        if (this.nbr < MAX) {
            this.vehicules.add(v);
        } else {
            System.out.println("Erreur");
        }
    }

    public void removeVehicule(String numI) {
        for (Vehicule vehicule : this.vehicules) {
            if (vehicule.immat.equals(numI)) {
                this.vehicules.remove(vehicule);
            }
        }
    }

    public void afficherParc() {
        for (Vehicule vehicule : this.vehicules) {
            vehicule.afficherInfos();
        }
    }
}
