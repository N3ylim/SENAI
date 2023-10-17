
import java.util.Scanner;

public class contar_vogais {

    public static int contarVogais(String frase) {

        int numeroDeVogais = 0;

        for (char caractere : frase.toCharArray()) {

            if (Character.isLetter(caractere) && (caractere == 'a' || caractere == 'e' || caractere == 'i'
                    || caractere == 'o' || caractere == 'u')) {
                numeroDeVogais++;
            }
        }

        return numeroDeVogais;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = scan.nextLine();

        int numeroDeVogais = contarVogais(palavra);

        System.out.println("Número de vogais: " + numeroDeVogais);

        scan.close();
    }
}
