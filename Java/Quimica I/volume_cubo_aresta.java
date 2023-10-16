import java.util.Scanner;

class volume_cubo_aresta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o comprimento da aresta em centímetros: "); // pedindo o comprimento da aresta em cm
        double aresta = scanner.nextDouble();

        double volume = Math.pow(aresta, 3); // fazendo o calculo

        System.out.println("O volume do cubo é: " + volume + "cm³"); // printando o resultado

        scanner.close();
    }
}