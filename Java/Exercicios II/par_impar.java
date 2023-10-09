import java.util.Scanner;

public class par_impar {
    public static void main(String[] args) {
         Scanner Scaner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n1 = Scaner.nextInt();

        if (n1 % 2 == 0){
            System.out.println("O número digitado é par");
        } else {
            System.out.println("O número digitado é impar");
        }
    }
}
