import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner Scaner = new Scanner(System.in);

        System.out.print("Digite o valor da altura: "); // pedindo a altura ao usuário
        double n1 = Scaner.nextDouble();

        System.out.print("Digite o valor da base: "); // pedindo a base ao usuário
        double n2 = Scaner.nextDouble();

        double area = n1 * n2; // fazendo o calculo da area

        System.out.printf("A aréa é: " + area); // printando o resultado
        
        Scanner.close();
    }
}
 
