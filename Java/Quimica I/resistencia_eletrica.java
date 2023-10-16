import java.util.Scanner;

class resistencia_eletrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a tensão em volts: "); // pedindo a tensão
        double tensao = scanner.nextDouble();

        System.out.print("Digite a corrente em amperes: "); // pedindo os amperes
        double corrente = scanner.nextDouble();
        
        double resistencia = tensao / corrente; // fazendo o calculo
        
        System.out.println("A resistência é: " + resistencia + " ohms"); // printando o resultado
        
        scanner.close();
    }
}