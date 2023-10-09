public class printar_nome {
    public static void main(String[] args) {
        Scanner Scaner = new Scanner(System.in);

        System.out.print("Digite seu nome: "); // pedindo o nome do/ao usuário
        String nome = Scaner.nextLine();

        System.out.printf("Treinando pela vigésima vez como printar o meu nome: '%s'", nome); // printando o resultado
    }
}

