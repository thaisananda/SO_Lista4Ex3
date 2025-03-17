package view;

import java.util.Random;

import controller.ThreadVetor;

public class Principal3 {
	
	public static void main(String[] args) {
		int [] vetor = new int[1000];
		Random random = new Random();
		
		for(int i = 0; i < 1000; i++) {
			vetor[i] = random.nextInt(100) + 1;
		}
		
		 ThreadVetor t1 = new ThreadVetor(2, vetor); // valor par
	     ThreadVetor t2 = new ThreadVetor(1, vetor); // valor ímpar
	     
	     t1.start();
	     t2.start();
	
	}

}
