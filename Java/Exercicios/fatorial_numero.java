public class fatorial_numero {

    public static void main(String[] args){

int num = 5; // Fatorial a ser calculado
int fat = 1; 

for(int i = 1; i <= num; i++){ // percorrendo o i até chegar no numero definido
fat = fat * i;
}

System.out.println("!" + num + " = " + fat); // printando o resultado

	}
}