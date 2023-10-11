import java.util.Scanner;

public class area_esfera {
     public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a área da superfície da esfera: "); // pedindo a area ao usuário
        double area = scan.nextDouble();

        double raio = Math.sqrt(area / (4 * Math.PI)); // fazendo o cálculo

        System.out.printf("O raio da esfera é: %.2f cm", raio); // printando o resultado

        scan.close();
    }
}

