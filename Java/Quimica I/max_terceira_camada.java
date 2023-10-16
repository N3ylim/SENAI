import java.util.Scanner;

public class max_terceira_camada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número atômico (número de prótons): "); // pedindo o numero atomico ao usuário
        int atomic = scanner.nextInt();

        int max = 2 * (int)Math.pow(atomic, 2); // fazendo o calculo

        System.out.println("A terceira camada pode acomodar até " + max + " elétrons."); // printando o resultado

        scanner.close();
    }
}