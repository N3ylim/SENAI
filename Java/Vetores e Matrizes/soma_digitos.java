import java.util.Scanner;

public class soma_digitos {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número : "); // pedindo um valor ao usuário
        int numero = scan.nextInt();

        somar_algoritimo(numero); // Executando a funçã
        
        scan.close();
    }

    public static void somar_algoritimo(int num) { // criando a função
        int soma = 0;
        while (num > 0) {
            soma += num % 10;
            num /= 10;
        }
        System.out.println("A soma dos número é: " + soma); // printando o resultado
    }
}


