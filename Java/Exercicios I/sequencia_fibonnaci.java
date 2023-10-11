public class sequencia_fibonnaci {
    public static void main(String[] args) {
        int n1 = 0; // definindo o valor das variaveis
        int n2 = 1;
        int n3;

        System.out.print(n1 + " "); 
        System.out.print(n2 + " ");
        for (int i = 3; i < 25; i++){ // fazendo um for para percorrer até chegar no numero definido
            n3 = n1 + n2;
            System.out.print(n3 + " "); // colocando espaço para separar os números no print
            n1 = n2;
            n2 = n3;
        }
    }
}

