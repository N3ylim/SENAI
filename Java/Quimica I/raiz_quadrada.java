import java.util.Scanner;

class raiz_quadrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número real não negativo: "); // pedindo o número ao usuário
        double numero = scanner.nextDouble();

        if (numero < 0) {
            System.out.println("O número deve ser não negativo."); // verificando se o numero é ou não negativo
        } else {
            double raizQuadrada = Math.sqrt(numero); // fazendo o calculo

            System.out.println("A raiz quadrada de " + numero + " é " + raizQuadrada + "."); // printando o resultado
        }

        scanner.close();
    }
}