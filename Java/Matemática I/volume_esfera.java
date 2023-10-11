import java.util.Scanner;

public class volume_esfera {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Escreva o valor do raio da esfera: "); // pedindo o raio da esfera
        double raio = Scanner.nextDouble();
        
        
        double soma = 4 * Math.PI * Math.pow(raio, 3) / 3  ; // fazendo o calculo do volume de acordo com o raio fornecido

        System.out.println("O volume da esfera é: " + soma); // printando o resultado

        Scanner.close();
    }
}


