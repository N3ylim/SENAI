import java.util.Scanner;

public class numero_primo {
    public static void main(String[] args) {
  
    Scanner scaner = new Scanner(System.in);

    System.out.print("Digite um numero: "); // pedindo um numero ao usuario
    int numero = scaner.nextInt(); // salvando o numero na variavel "numero"

    boolean primo = true;

    if (numero <= 1) {
        primo = false;
    } else {
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0)
            primo = false;
            break;
}
 }
    if (primo) {
        System.out.println("é um número primo");
    } else {
        System.out.println("Não é um número primo");
    }
    scaner.close();
  }
   }


