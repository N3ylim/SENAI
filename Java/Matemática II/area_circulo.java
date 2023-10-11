public class area_circulo {

        public static void main(String[] args) {

            double comprimento = 20.0; // comprimento do circulo
            double largura = 10.0; // largura do circulo
    
            double perimetro = 2 * (comprimento + largura); // Cálculo do perímetro do retângulo
    
            double raio = perimetro / (2 * Math.PI); // Cálculo do raio do circulo
    
            double area = Math.PI * Math.pow(raio, 2); // Cálculo da área do círculo
    
            System.out.println("O raio do círculo é: " + raio + " cm"); // printando o resultado
            System.out.println("A área do círculo é: " + area + " cm²");
        }
    }
