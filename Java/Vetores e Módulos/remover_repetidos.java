import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class remover_repetidos {

    public static List<Integer> removerElementosRepetidos(List<Integer> lista) {

        HashSet<Integer> conjunto = new HashSet<>();

        for (Integer numero : lista) {
            conjunto.add(numero);
        }

        return new ArrayList<>(conjunto);
    }

    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1, 2, 3, 2, 1, 4, 5, 3);

        List<Integer> listaSemRepetidos = removerElementosRepetidos(lista);

        System.out.println("Lista original: " + lista);
        System.out.println("Lista sem elementos repetidos: " + listaSemRepetidos);
    }
}
