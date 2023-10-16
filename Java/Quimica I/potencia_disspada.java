import java.util.Scanner;

class potencia_disspada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a tensão em volts: "); // pedindo a tenção em volts
        double tensao = scanner.nextDouble();

        System.out.print("Digite a resistência em ohms: "); // pedindo a resistencia em ohms
        double resistencia = scanner.nextDouble();

        double potencia = (tensao * tensao) / resistencia; // fazendo o calculo

        System.out.println("A potência dissipada é: " + potencia + "W"); //printando o resultado

        scanner.close();
    }
}
