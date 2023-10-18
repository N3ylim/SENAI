import java.util.Scanner;

public class area_trapézio {

    public static int soma(int base_maior, int base_menor, int altura) { // executando a função
        return ((base_maior + base_menor) * altura) / 2 ; 
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor da base maior: "); // pedindo o valor da base meior
        int base_maior = scan.nextInt();

        System.out.println("Digite o valor da base menor: "); // pedindo o valor da base menor
        int base_menor = scan.nextInt();

        System.out.println("Digite o valor da altura: "); // pedindo o valor da altura
        int altura = scan.nextInt();

        int resultado = soma(base_maior, base_menor, altura);
        System.out.println("Resultado: " + resultado); // printando o resultado

        scan.close();
    }
}


