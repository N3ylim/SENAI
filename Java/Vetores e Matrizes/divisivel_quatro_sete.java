import java.util.Scanner;

public class divisivel_quatro_sete {

    public static boolean e_divisivel_4(int num) { // definindo a função
        return num % 4 == 0;  // retornando o resultado

        }
    

    public static boolean e_divisivel_7(int num) { // definindo a função
        return num % 7 == 0; // retornando o resultado
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: "); // pedindo o número ao usuário
        int num = scan.nextInt();

        if (e_divisivel_4(num) && e_divisivel_7(num)) { // verificando se é ou não divisivél
            System.out.println("O número é divisivel por 4 e 7"); // printando o resultado
        } else {
            System.out.println("O número não é divisivel por 4 e 7");
        }

        scan.close();

    }

}