import java.util.Scanner;

class peso_planeta_diferente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a massa do objeto em quilogramas: "); // pedindo a massa do objeto
        double massa = scanner.nextDouble();
        System.out.print("Digite a aceleração gravitacional do planeta em m/s²: "); // pedindo a aceleração do planeta desejado
        double aceleracaoGravitacional = scanner.nextDouble();

        double peso = massa * aceleracaoGravitacional; // fazendo o calculo

        System.out.println("O peso do objeto é: " + peso + "N"); // printando o resultado

        scanner.close();
    }
}