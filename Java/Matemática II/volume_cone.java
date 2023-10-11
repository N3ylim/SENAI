public class volume_cone {
    public static void main(String[] args) {

        double volume = 94.0; // Volume do cone 
        double altura = 9.0; // Altura do cone 

        double raio = Math.sqrt((3 * volume) / (Math.PI * altura)); // fazendo o calculo

        System.out.printf("O raio da base do cone é: %.2f cm", raio); // printando o resultado
    }
}


