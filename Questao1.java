

package desafioCapgemini;
import java.util.Scanner;
import java.util.Arrays;

public class Questao1 {
	
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    int n=0;
	    //Solicia��o de quantidade de n�meros no vetor
	    System.out.printf("Informe um n�mero �mpar para o tamanho do vetor: ");
	    n = ler.nextInt();
	    //defini��o do vetor
	    int v[] = new int[n]; 
	    int i; 
	    //solicita��o dos n�meros para cada posi��o do vetor
	    for (i=0; i<n; i++) {
	      System.out.printf("Informe %2do. valor de %d: ", (i+1), n);
	      v[i] = ler.nextInt();
	    }
	    //ordena��o do vetor em ordem crescente
	    Arrays.sort(v);
	    //impress�o dos valores do vetor
        System.out.println("N�meros ordenados:");
        for(int numero : v)
            System.out.println(numero);
        System.out.println();
        
        int mediana = 0; 
        //calculo da mediana
        mediana=(n/2);
        //impress�o da mediana
        System.out.printf("A mediana �: %d", v[mediana]);
        
}
}
