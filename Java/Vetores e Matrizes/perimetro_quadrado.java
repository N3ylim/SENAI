import java.util.Scanner;

public class perimetro_quadrado {

    public static int multi(int lado) { // definindo a função
        return lado * 4;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do lado do quadrado: "); // pedindo um número ao usuário
        int lado = scan.nextInt();

        int resultado = multi(lado);
        System.out.println("o primetro do quadrado é: " + resultado); // printando o resultado

        scan.close();
    }
}

