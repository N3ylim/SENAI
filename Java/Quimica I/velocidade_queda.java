import java.util.Scanner;

class velocidade_queda {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Altura (m): "); // pedindo a altura ao usuário
        double altura = scanner.nextDouble();

        System.out.print("Aceleração Gravitacional (m/s²): "); // pedindo a aceleração ao usário
        double aceleração = scanner.nextDouble();

        double velocidade = Math.sqrt(2 * aceleração * altura); // fazendo o calculo

        System.out.println("Velocidade final: " + velocidade + " m/s"); // printando o resultado
        
        scanner.close();
    }
}