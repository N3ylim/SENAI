public class maior_divisor_comum {  //maior divisor comum de um numero
    public static void main(String[] args){
        int n1 = 45664;
        int MaiorDivisor = 1; // definindo as variaveis

        for (int i = 2; i <= n1; i++ ){ // fazendo um for para percorrer os divisiveis do numero
            if(n1 % i == 0) {
                MaiorDivisor = i;
          }
      }
    System.out.println("O maior divisor do " + n1 + " é o " + MaiorDivisor);
  }
}
