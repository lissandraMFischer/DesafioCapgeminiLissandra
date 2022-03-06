

package desafioCapgemini;
import java.util.Scanner;
import java.util.Arrays;

public class Questao1 {
	
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    int n=0;
	    //Soliciação de quantidade de números no vetor
	    System.out.printf("Informe um número ímpar para o tamanho do vetor: ");
	    n = ler.nextInt();
	    //definição do vetor
	    int v[] = new int[n]; 
	    int i; 
	    //solicitação dos números para cada posição do vetor
	    for (i=0; i<n; i++) {
	      System.out.printf("Informe %2do. valor de %d: ", (i+1), n);
	      v[i] = ler.nextInt();
	    }
	    //ordenação do vetor em ordem crescente
	    Arrays.sort(v);
	    //impressão dos valores do vetor
        System.out.println("Números ordenados:");
        for(int numero : v)
            System.out.println(numero);
        System.out.println();
        
        int mediana = 0; 
        //calculo da mediana
        mediana=(n/2);
        //impressão da mediana
        System.out.printf("A mediana é: %d", v[mediana]);
        
}
}
