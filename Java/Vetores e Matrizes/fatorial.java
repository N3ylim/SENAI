import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 

        System.out.println("Digite o primeiro numero: "); // pedindo um valor ao usuário
        int num = scan.nextInt();

        int fatorial = calcularFatorial(num); // executando a função
        System.out.println("Fatorial de " + num + " é " + fatorial); // printando o resultado

        scan.close();
    }

    public static int calcularFatorial(int n) {
        if (n == 0 || n == 1) { // criando a função
            return 1;
        }
        return n * calcularFatorial(n - 1);
    }
}
