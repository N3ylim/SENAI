public class maior_numero {
    public static void main(String[] args){
        int n1 = 10; // Definindo os números
        int n2 = 11;
        int n3 = 12;


        if (n1 > n2) {
            System.out.println("O maior número é: " + n1); //Comparando os números para ver o maior

        } else if (n2 > n3) {
            System.out.println("O maior número é: " + n2);

        } else {
            System.out.println("O maior número é: " + n3);
        }

        if (n1 < n2) {
        System.out.println("O menor número é: " + n1); //Comparando os números para ver o menor

        } else if (n2 < n3) {
            System.out.println("O menor número é: " + n2);

        } else {
            System.out.println("O menor número é: " + n3);
        }
    }
}
