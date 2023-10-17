public class soma_pares {
    public static void main(String[] args) {
        int[] num = { 2, 3, 6, 8, 10, 11 };
        int somaPares = calcular_Pares(num);
        System.out.println("A soma dos números pares é: " + somaPares);
    }

    public static int calcular_Pares(int[] num) {
        int soma_pares = 0;
        for (int i = 0; i < num.length; i++) {
            int numeroAtual = num[i];
            if (numeroAtual % 2 == 0) {
                soma_pares += numeroAtual;
            }
        }
        return soma_pares;
    }
}
