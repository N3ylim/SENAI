import java.util.Scanner;

public class numero_primo {
    public static void main(String[] args) {
  
    Scanner scaner = new Scanner(System.in);

    System.out.print("Digite um numero: "); // pedindo um numero ao usuario
    int numero = scaner.nextInt(); // salvando o numero na variavel "numero"

    boolean primo = true;

    if (numero <= 1) { //comparando o numero com o um caso ele for menor ou igual
        primo = false; // caso a condição acima esteja de acordo, o número não é primo
    } else {
        for (int i = 2; i < numero; i++) { 
            if (numero % i == 0) // caso o resto seja igual azero, o número não é primo
            primo = false;
            break; // parando o loop
}
 }
    if (primo) {
        System.out.println("é um número primo"); // printando o resultado
    } else {
        System.out.println("Não é um número primo");
    }
  }
   }


