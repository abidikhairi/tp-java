package tp3.ex2;

public class TestPersonne {

    public static void main(String[] args) {
        Personne P1 = new Personne("Abidi ","Ali",'H',2000,"célibataire",false);
        Personne P2 = new Personne("Wilani","Wassila",'F',2002,"célibataire",false);

        System.out.println("******* Informations avant le mariage **********");
        P1.retourneInfos();
        P2.retourneInfos();
        P1.marier(P2);
        System.out.println("******* Informations aprés le mariage **********");
        P1.retourneInfos();
        P2.retourneInfos();
    }
}
