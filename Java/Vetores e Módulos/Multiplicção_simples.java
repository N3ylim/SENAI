import java.util.Scanner;

public class Multiplicção_simples {
    public static int multi(int n1, int n2) {
        return n1 * n2;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int n1 = scan.nextInt();

        System.out.println("Digite o segundo número: ");
        int n2 = scan.nextInt();

        int resultado = multi(n1, n2);
        System.out.println("Resultado: " + resultado);

        scan.close();
    }
}
