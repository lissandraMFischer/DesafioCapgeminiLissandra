package desafioCapgemini;

public class Questao2 {

	public static void main(String[] args) {
	    //defini��o do vetor
	    int v[] = {1, 3, 7, 9, 6, 2};
	    //defini��o da diferen�a 
	    int d=2;
	    int i=0;
	    int cont=0;
	    //verifica��o se a diferen�a entre cada posi��o do vetor � igual ao numero definido
	    for (i=0; i<5; i++) {
	    	if((v[0]-v[i]) == d) {
	    		cont=cont+1;
	    	  	   	 
	    }
	    }
	    for (i=0; i<5; i++) {
	    	if((v[1]-v[i]) == d) {
	    		cont=cont+1;
	    	}
	     for (i=0; i<5; i++) {
	    	if((v[2]-v[i]) == d) {
	    		cont=cont+1;
	    	}
	     }
	     for (i=0; i<5; i++) {
	    	if((v[3]-v[i]) == d) {
	    		cont=cont+1;
	    	}
	     }
	     for (i=0; i<5; i++) {
	    	if((v[4]-v[i]) == d) {
	    		cont=cont+1;
	    	}}
	     for (i=0; i<5; i++) {
	    	if((v[5]-v[i]) == d) {
	    		cont=cont+1;
	    	}}
	    	 
  	 
	    }
	    //retorno ao usuario da quantidade de pares que s�o poss�veis
	    System.out.printf("O numero de pares que podem ser formados com a diferen�a de %d �: %d \n", d, cont);
	    for (i=0; i<6; i++) {
	       System.out.printf("%2d\n", v[i]);
	       
	      }
	
}
}