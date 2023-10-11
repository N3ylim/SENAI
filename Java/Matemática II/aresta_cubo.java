public class aresta_cubo {
    public static void main(String[] args) {

        double volume = 512.0; // Volume do cubo 

        double calculo = Math.cbrt(volume); // Calcula o comprimento de uma aresta do cubo

        System.out.printf("O comprimento de uma aresta do cubo é: %.2f cm", calculo); // printando o resultado

    }
}

