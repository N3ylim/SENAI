
import java.util.Scanner;

public class contar_vogais {

    public static int contarVogais(String frase) { // executando a função

        int numeroDeVogais = 0; // definindo a variável

        for (char caractere : frase.toCharArray()) {

            if (Character.isLetter(caractere) && (caractere == 'a' || caractere == 'e' || caractere == 'i' // verificando os caracteres
                    || caractere == 'o' || caractere == 'u')) { 
                numeroDeVogais++;
            }
        }

        return numeroDeVogais; // retornando a função
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma palavra: "); // pedindo ao usuário um palavra
        String palavra = scan.nextLine();

        int numeroDeVogais = contarVogais(palavra);

        System.out.println("Número de vogais: " + numeroDeVogais); // printando o resultado

        scan.close();
    }
}
