package projects.caesar_cipher;

public class Application {

    public static void main(String[] args) {
        CaesarCipher caesarCipher = new CaesarCipher(4);

        String inputText = "Alea jacta est";

        String encrypted = caesarCipher.encrypt(inputText);
        String decrypted = caesarCipher.decrypt(encrypted);

        System.out.println("Original Text: " + inputText);
        System.out.println("Encrypted Text: " + encrypted);
        System.out.println("Decrypted Text: " + decrypted);

    }
}
