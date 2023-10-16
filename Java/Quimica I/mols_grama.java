import java.util.Scanner;

public class mols_grama {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite a quantidade de mols: "); // pedindo a quantidade de mols
        double mols = scanner.nextDouble();

        System.out.print("Digite a massa molar em g/mol: "); // pedindo a quantidade de g/mols
        double massaMolar = scanner.nextDouble(); 

        double massa = mols * massaMolar; // fazendo o calculo

        System.out.println("A massa é: " + massa + "g"); // printando o resultado

        scanner.close();
    }
}