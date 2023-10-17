import java.util.Arrays;
import java.util.List;

public class ordenar_numeros {

    public static void bubbleSort(List<Integer> lista) {

        for (int i = 0; i < lista.size() - 1; i++) {

            for (int j = i + 1; j < lista.size(); j++) {

                if (lista.get(i) > lista.get(j)) {
                    int aux = lista.get(i);
                    lista.set(i, lista.get(j));
                    lista.set(j, aux);
                }
            }
        }
    }

    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(5, 2, 8, 1, 9, 3);

        System.out.println("Lista original: " + lista);

        bubbleSort(lista);

        System.out.println("Lista ordenada: " + lista);
    }
}
