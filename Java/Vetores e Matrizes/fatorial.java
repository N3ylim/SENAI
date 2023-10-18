import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int num = scan.nextInt();

        int fatorial = calcularFatorial(num);
        System.out.println("Fatorial de " + num + " é " + fatorial);

        scan.close();
    }

    public static int calcularFatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calcularFatorial(n - 1);
    }
}
