import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ordenar_numeros {
    public static void main(String[] args) {
        List<Integer> listaOriginal = new ArrayList<>(); // executando a função
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite 8 números: "); // printando o resultado
        for(int i = 0; i < 8; i++){ // percorrer a lista
            int numero = ler.nextInt();
            listaOriginal.add(numero);
        }

        ordenarLista(listaOriginal); // executando a função

        ler.close();
    }

    public static void ordenarLista(List<Integer> lista){

        lista.sort(null);
        
        System.out.println("\nNova lista ordenada: "); // printando o resultado
        for(int i = 0; i < lista.size(); i++){
            System.out.print(lista.get(i) + " ");
        }
    }
}
