import java.util.Scanner;

public class numero_perfeito {
    public static boolean e_perfeito(int numero) { // executando a função
        int soma_divisores = 0; // definindo o valor da variavel

        for (int i = 1; i < numero; i++) { // percorrendo o numero
            if (numero % i == 0) {
                soma_divisores += i;
            }
        }
        return soma_divisores == numero; // retornando o resultado
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite um número: "); // pedindo um valor ao usuário
        int numero = scan.nextInt();

        scan.close();

        if (numero <= 0) {
            System.out.println("O número não é perfeito."); // verificando se é perfeito
        } else if (e_perfeito(numero)) {
            System.out.println("O número é perfeito."); // printando o resultado
        } else {
            System.out.println("O número não é perfeito.");
        }
    }
}
