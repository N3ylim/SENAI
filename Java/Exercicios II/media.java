import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite 3 numeros para fazer a média dos números"); // pedindo 3 números ao usuário
        
        System.out.print("\nN° 1: ");
        int n1 = scanner.nextInt();

        System.out.print("N° 2: ");
        int n2 = scanner.nextInt();

        System.out.print("N° 3: ");
        int n3 = scanner.nextInt();
        
     

        int soma = n1 + n2 + n3; // fazendo o calculo da soma
        int media = soma / 3; // fazendo o calculo da média com a variavel da soma

        System.out.println("A média dos números é: " + media); // printando o resultado
    }
}
