import java.util.Scanner;

class velocidade_media {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância em metros: "); // pedindo a distancia ao usuário
        double distancia = scanner.nextDouble();

        System.out.print("Digite o tempo em segundos: "); // pedindo o tempo ao usuário
        double tempo = scanner.nextDouble();

        double velocidade = distancia / tempo; // fazendo o cálculo

        System.out.printf("A velocidade média é: %.2f m/s", velocidade); // printando o resultado

        scanner.close();
    }
}
