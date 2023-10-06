import java.util.Scanner;

public class par_impar {
    public static void main(String[] args) {
  
    Scanner scaner = new Scanner(System.in);

    System.out.print("Digite um numero: "); // pedindo um numero ao usuario
    int numero = scaner.nextInt(); // salvando o numero na variavel "numero"

    if (numero % 2 == 0) {
        System.out.println("O número é par"); // testando se ele é impar ou par
    }
    else {
         System.out.println("O número é ímpar");
  }
 }
}
