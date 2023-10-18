import java.util.Arrays;
import java.util.Scanner;

public class calcular_media {

    public static double calcularMedia(double[] notas) { // executando a função
        double soma = 0;

        for (double nota : notas) { // percorrendo as notas
            soma += nota;
        }
        return soma / notas.length; // retornando o resultado
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite as notas separadas por espaços: "); // pedindo o valor aos usuários
        String notasStr = scan.nextLine();

        double[] notas = Arrays.stream(notasStr.split(" ")) // criando a função
                .mapToDouble(Double::parseDouble)
                .toArray();

        double media = calcularMedia(notas);
        System.out.println("Média das notas: " + media); // printando o resultado

        scan.close();
    }
}

