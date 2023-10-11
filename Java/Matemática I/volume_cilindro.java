import java.util.Scanner;

public class volume_cilindro {
        public static void main(String[] args) {
     
            
    Scanner Scanner = new Scanner(System.in);

    System.out.print("Escreva o valor da base do cilindro: "); // pedindo o valor da base do cilindro
    double base = Scanner.nextDouble();

    System.out.print("Escreva o valor da altura do cilindro: "); // pedindo a altura do cilindro
    double altura = Scanner.nextDouble();
        
        
    double soma = Math.PI * Math.pow(base, 2) * altura; // fazendo o calculo do volume de acordo com as infoprmações fornecidas
    
    System.out.printf("O volume do cilindro é: %.2f", soma); // printando o resultado

    Scanner.close();
    }
}


