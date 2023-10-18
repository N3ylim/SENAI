import java.util.Scanner;

public class soma_digitos {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número: "); // pedindo um número ao usuário
        int numero = ler.nextInt();

        somarAlgarismos(numero); // executando a função

        ler.close();
    }

    public static void somarAlgarismos(int num) { // criando a função
        int soma = 0;
        while (num > 0) {
            soma += num % 10;
            num /= 10;
        }

        System.out.println("A soma entre os algarismos é: " + soma); // printando o resultado
    }

}
