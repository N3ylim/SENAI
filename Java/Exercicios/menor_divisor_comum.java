public class menor_divisor_comum { //menor divisor comum de um numero
    public static void main(String[] args){
        int n1 = 5;
        int MaiorDivisor = 1; // definindo as variaveis

        for (int i = 2; i >= n1; i++ ){ // fazendo um for para percorrer os divisiveis do numero
            if(n1 % i == 0) {
                MaiorDivisor = i;
          }
      }
    System.out.println("O menor divisor do " + n1 + " é o " + MaiorDivisor);
  }
}

