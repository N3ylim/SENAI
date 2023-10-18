import java.util.Scanner;

public class verificar_palindromo {

    public static boolean ehPalindromo(String palavra) {
        String palavraInvertida = ""; // Inicializa a palavra invertida.

        for (int i = palavra.length() - 1; i >= 0; i--) { // Percorre a palavra original de trás para frente.
            palavraInvertida += palavra.charAt(i); // Adiciona o caractere atual da palavra original à palavra invertida.
        }

        return palavra.equals(palavraInvertida); / // retornando o resultado
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = scan.nextLine();

        boolean ehPalíndromo = ehPalindromo(palavra); // Verifica se a palavra é um palíndromo.

        if (ehPalíndromo) { // printando o resultado
            System.out.println("A palavra é um palíndromo.");
        } else {
            System.out.println("A palavra não é um palíndromo.");
        }

        scan.close();
    }
}
