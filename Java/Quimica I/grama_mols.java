import java.util.Scanner;

public class grama_mols {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a massa em gramas: "); // pedindo a quantidade de massa para o usuário
        double massaGramas = scanner.nextDouble(); 

        System.out.print("Digite a massa molar em g/mol: "); // pedindo a massa em g/mol
        double massaMolar = scanner.nextDouble();

        double mols = massaGramas / massaMolar; // fazendo o calculo

        System.out.println("A quantidade de mols é: " + mols); // printando o resultado

        scanner.close(); 
    }
}