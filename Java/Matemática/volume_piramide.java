import java.util.Scanner;

public class volume_piramide {
    public static void main(String[] args) {
    Scanner Scanner = new Scanner(System.in);

    System.out.print("Escreva o valor da base da piramide: "); // pedindo o valor da base da piramide
    double base = Scanner.nextDouble();

    System.out.print("Escreva o valor da altura da piramide: "); // pedindo a altura da piramide
    double altura = Scanner.nextDouble();
        
        
    double soma = Math.pow(base, 2) * altura / 3; // fazendo o calculo do volume de acordo com as infoprmações fornecidas
    
    System.out.println("O volume da piramide é: " + soma); // printando o resultado

    Scanner.close();
    }
}

