package tp5;

public class Test {

    public static void main(String[] args) {
        Camion v1 = new Camion("12TUN4586", 2015, "Scania 123", "Scania", 10.2);
        Voiture v2 = new Voiture("123TUN4580", 2008, "Symbol", "Peugeot", 5);

        Parc parc = new Parc();

        parc.addVehicule(v1);
        parc.addVehicule(v2);

        parc.afficherParc();
    }
}
