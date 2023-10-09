import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        Scanner Scaner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n1 = Scaner.nextInt();

        System.out.print("Digite outro número: ");
        int n2 = Scaner.nextInt();

        int soma = n1 + n2;

        System.out.println("A soma dos numeros é: " + soma);
    }
}
