import java.util.Scanner;

public class area_perimetro {
    public static void main(String[] args) {
         Scanner Scanner = new Scanner(System.in);

        System.out.print("Escreva o valor do raio, bara obter a área e o perimetro: "); // pedindo o raio ao usuário
        double raio = Scanner.nextDouble();


        double area = 3.14 * 2 * raio; // fazendo o calculo da area

        System.out.println("A circunferencia do circulo: " + area); // printando o resultado
        Scanner.close();
    }
}
