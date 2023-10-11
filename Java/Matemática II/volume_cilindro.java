public class volume_cilindro {
    public static void main (String[] args) {
    double volume = 785; // definindo as variáveis
    double altura = 13;
            

    double x = (4 * volume) / (altura * Math.PI); // fazendo os calculos
    double diametro = Math.sqrt(x);

    double raio = diametro / 2;

    System.out.printf("O raio da base é igual a: %.2f", raio); // printando o resultado
    
    
    }
        
}
