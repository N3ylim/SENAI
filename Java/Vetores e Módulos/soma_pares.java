public class soma_pares {
    public static void main(String[] args) {
        int[] num = { 2, 3, 6, 8, 10, 11 }; // definindo os valores na lista
        int somaPares = calcular_Pares(num); // executando a função
        System.out.println("A soma dos números pares é: " + somaPares); // printando o resultado
    }

    public static int calcular_Pares(int[] num) {
        int soma_pares = 0;
        for (int i = 0; i < num.length; i++) { // criando a função
            int numeroAtual = num[i];
            if (numeroAtual % 2 == 0) { // percorrendo os número e verificando se é par
                soma_pares += numeroAtual;
            }
        }
        return soma_pares; // retornando o resultado
    }
}
