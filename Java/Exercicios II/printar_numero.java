public class printar_numero {
    public static void main(String[] args) {
        Scanner Scaner = new Scanner(System.in);

        System.out.print("Digite um número: "); // pedindo um número ao usuário
        double numero = Scaner.nextDouble();

        System.out.printf("Treinando pela vigésima vez como printar um número: '%.1f'", numero); // printando o número
    }
}


