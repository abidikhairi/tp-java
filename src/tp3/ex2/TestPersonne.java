package tp3.ex2;

public class TestPersonne {

    public static void main(String[] args) {
        Personne P1 = new Personne("John ","Doe",'H',2000,"célibataire",false);
        Personne P2 = new Personne("Jane","Doe",'F',2002,"célibataire",false);

        System.out.println("******* Informations avant le mariage **********");
        P1.retourneInfos();
        P2.retourneInfos();
    }
}
