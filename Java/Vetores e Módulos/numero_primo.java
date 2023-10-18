import java.util.Scanner;

public class numero_primo {


    public static boolean ehPrimo(int numero) { // executando a função
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i * i <= numero; i++) { // percorrendo o numero para verificar se é primo
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: "); // pedindo o número ao usuário
        int numero = scanner.nextInt();

        boolean ehPrimo = ehPrimo(numero);

        if (ehPrimo) {
            System.out.println("O número é primo."); // verificando se é ou não e printando o resultado
        } else {
            System.out.println("O número não é primo.");
        }
    }
}

