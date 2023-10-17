import java.util.Arrays;
import java.util.Scanner;

public class calcular_media {

    public static double calcularMedia(double[] notas) {
        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite as notas separadas por espaços: ");
        String notasStr = scan.nextLine();

        double[] notas = Arrays.stream(notasStr.split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        double media = calcularMedia(notas);
        System.out.println("Média das notas: " + media);

        scan.close();
    }
}

