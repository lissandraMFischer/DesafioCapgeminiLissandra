package desafioCapgemini;
import java.util.*;
import java.util.Scanner;


public class Questao3 {
	
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    String frase = " ";
	    //solicitação da frase
	    System.out.printf("Informe uma frase ");
	    frase = ler.nextLine();
	    //remoção dos espaços vazios
	    String fr = frase.replaceAll("\\s+","");
		System.out.println(fr);
		//calculo do tamanho da frase
	    int tamanho = fr.length();
	    System.out.println(tamanho);
	    //calculo da raiz quadrada do tamanho da string
	    double resultado= Math.sqrt(tamanho);
	    System.out.println(resultado);
	    //conversão do resultado da raiz para inteiro
	    int valor = (int)resultado;
	    //criação do vetor de caracteres da string
	    List<String> partes = new ArrayList<String>();
        for (int i = 0; i < fr.length(); i += valor) partes.add(fr.substring(i, Math.min(i + valor,fr.length())));
        //reordenação das posições do vetor
        partes.sort(null);
        //impressão da mensagem criptografada
        System.out.println(partes); 
		  }
}
