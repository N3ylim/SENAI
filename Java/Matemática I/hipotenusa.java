import java.util.Scanner;

public class hipotenusa {
    public static void main(String[] args) {
        Scanner Scaner = new Scanner(System.in);

        System.out.print("Digite o valor de a: "); // pedindo o valor de a pro usuário
        Double a = Scaner.nextDouble(); 

        System.out.print("Digite o valor de b: "); // pedindo o valor de b pro usuário
        Double b = Scaner.nextDouble(); 

        Double hipotenusa = Math.pow(a,2) + Math.pow(b,2); // fazendo o calculo
        hipotenusa = Math.sqrt(hipotenusa);

        System.out.println("A hipotenusa dos números fornecidos é: " + hipotenusa); // printando o resultado

        Scaner.close();

    }
}
