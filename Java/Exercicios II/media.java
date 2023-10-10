import java.util.Scanner;

public class media {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Digite 3 numeros para fazer a média dos números");
        
        System.out.print("\nN° 1: ");
        int n1 = scanner.nextInt();

        System.out.print("N° 2: ");
        int n2 = scanner.nextInt();

        System.out.print("N° 3: ");
        int n3 = scanner.nextInt();
        
     

        int soma = n1 + n2 + n3;
        int media = soma / 3;

        System.out.println("A média dos números é: " + media);
        scanner.close();
    }
}