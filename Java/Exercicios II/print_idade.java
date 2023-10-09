public class print_idade {
    public static void main(String[] args) {
        Scanner Scaner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = Scaner.nextInt();
        
        System.out.printf("Sua idade é: %d anos", idade);
    }
}
