import java.util.Scanner;

public class area_trapezio {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Escreva o valor da altura do trapézio: "); // pedindo a altura do trapézio
        double altura = Scanner.nextDouble();
        
        System.out.print("Escreva o valor da base menor do trapézio: "); // pedindo a base ao usuario
        double base_maior = Scanner.nextDouble();

        System.out.print("Agora da base maior: "); // pedindo a base ao usuário
        double base_menor = Scanner.nextDouble();

        
        double soma = (base_menor + base_maior) * altura / 2 ; // fazendo o calculo da area de acordo com as informações fornecidas

        System.out.println("A area do trapézio é: " + soma); // printando o resultado
        Scanner.close();
    }
            
}
