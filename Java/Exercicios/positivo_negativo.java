import java.util.Scanner;

public class positivo_negativo {
    public static void main(String[] args) {
  
    Scanner scaner = new Scanner(System.in);

    System.out.print("Digite um numero: "); // pedindo um numero ao usuario
    int numero = scaner.nextInt(); // salvando o numero na variavel "numero"

    if (numero > 0) {
        System.out.println("O número é positivo"); // testando se ele é negativo ou positivo
    }
    else {
         System.out.println("O número é negativo");
  }
    Scanner.close();
 }
}
