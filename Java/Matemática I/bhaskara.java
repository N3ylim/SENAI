import java.util.*;

public class bhaskara {
    public static void main(String[] args) {
     Scanner Scaner = new Scanner(System.in);

        System.out.print("Digite o valor de a: "); // pedindo o valor de a pro usuário
        int a = Scaner.nextInt(); 

        System.out.print("Digite o valor de b: "); // pedindo o valor de b pro usuário
        int b = Scaner.nextInt(); 

        System.out.print("Digite o valor de c: "); // pedindo o valor de c pro usuário
        int c = Scaner.nextInt(); 

        double delta = (b * b) - (4 * (a * c)); // fazendo o cálculo do Delta

        System.out.println("\n******************\n");

        if (a == 0) {
            System.out.println("O valor de a, deve ser diferente que 0"); // eliminando um falso resultado
        } if  (delta < 0) {
            System.out.println("Sem raízes reais"); // eliminando um falso resultado
        } else {
            double x1 = (-(b) + Math.sqrt(delta)) / (2 * a); // fazendo o calculo de x1
            double x2 = (-(b) - Math.sqrt(delta)) / (2 * a); // fazendo o calculo de x2

            System.out.println("x1: " + x1); // printando o resultado
            System.out.println("x2: " + x2);
        }
        Scaner.close();

    }
}

