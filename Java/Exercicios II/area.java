import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner Scaner = new Scanner(System.in);

        System.out.print("Digite o valor da altura: ");
        double n1 = Scaner.nextDouble();

        System.out.print("Digite o valor da base: ");
        double n2 = Scaner.nextDouble();

        double area = n1 * n2;

        System.out.printf("A aréa é: " + area);
        Scaner.close();
    }
}
 
