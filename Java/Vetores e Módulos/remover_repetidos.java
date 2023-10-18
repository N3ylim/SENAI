public class remover_repetidos {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 2, 1, 4, 5, 3}; // definindo os valores

        int novoTamanho = removeRepetidos(vetor); // executando a função

        System.out.println("Vetor sem elementos repetidos: "); // printando o resultado
        for (int i = 0; i < novoTamanho; i++) { // percorrendo o vetor
            System.out.println(vetor[i] + " ");
        }
    }

    public static int removeRepetidos(int[] vetor) {  // executando a função
        int novoTamanho = 0;

        for (int i = 0; i < vetor.length; i++) { // percorrendo o vetor com o tamanho dele
            boolean repetido = false;

            for (int j = 0; j < novoTamanho; j++) { // percorrendo o novo vetor com o tamanho do for anterior
                if (vetor[i] == vetor[j]) {
                    repetido = true;
                    break; // parando o for
                }
            }

            if (!repetido) { // verificando
                vetor[novoTamanho] = vetor[i];
                novoTamanho++;
            }
        }

        return novoTamanho; // retornando o resultado
    }
}
