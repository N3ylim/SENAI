import java.util.Scanner;

class força_mover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a massa em quilogramas: "); // pedindo a massa em quilogramas
        double massa = scanner.nextDouble();

        System.out.print("Digite a aceleração em m/s²: "); // pedindo a aceleração
        double aceleracao = scanner.nextDouble();

        double forca = massa * aceleracao; // fazendo o calculo

        System.out.println("A força necessária é: " + forca + "N"); // printando o resultado

        scanner.close();
    }
}