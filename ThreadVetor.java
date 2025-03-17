package controller;

public class ThreadVetor extends Thread {
	
	private int valor; 
	private int[] vetor;
	
	public ThreadVetor(int valor, int[] vetor) {
		this.valor = valor;
		this.vetor = vetor;
	}
	
	@Override
	public void run() {
		long inicio = System.nanoTime();
		
		if(valor % 2 == 0) {
			for(int i = 0; i < vetor.length; i++) {
				int temp = vetor[i];
			}
			
		}else {
			for(int num : vetor) {
				int temp = num;
			}
		}
		long fim = System.nanoTime();
		
		double tempoSegundos = (fim - inicio) / 1_000_000_000.0;
		
		 System.out.println("Thread valor = " + valor + " | Tempo: " + tempoSegundos + " s");
	}

}
