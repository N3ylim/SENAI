import java.util.Scanner;

public class superficie_cubo {

    public static void main(String[] args) {
        Scanner Scaner = new Scanner(System.in);

        System.out.print("Digite a aresta do cubo: "); // pedindo o valor da aresta do cubo
        Double a = Scaner.nextDouble(); 

        Double area = 6 * Math.pow(a, 2); // fazendo o calculo da area
        Double volume = Math.pow(a, 3); // fazendo o calculo do volume

        System.out.println("O volume do Cubo é: " + volume); // printando o resultado
        System.out.println("A area do Cubo é: " + area);

        Scaner.close();

    }
}

