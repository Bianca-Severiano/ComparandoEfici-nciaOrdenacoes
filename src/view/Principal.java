package view;

import br.edu.fateczl.ordenacao.bubblesort.ControllerB;
import br.edu.fateczl.ordenacao.mergesort.ControllerM;
import br.edu.fateczl.ordenacao.quicksort.ControllerQuinckSort;

public class Principal {

	public static void main(String[] args) {
		int[] veta = new int[1500];
		int[] vetb = new int[1500];
		int[] vetc = new int[1500];
		int cont = 1499;

		for (int i = 0; i < veta.length; i++) {
			veta[i] = cont;
			vetb[i] = cont;
			vetc[i] = cont;
			cont --;

		}

		// QuickSort
		ControllerQuinckSort qs = new ControllerQuinckSort();
		
		int tamanhoA = veta.length-1;
		double TempInicialqs = System.nanoTime();
		
		qs.quickSort(veta, 0, tamanhoA);
		
		double TempoFinalqs = System.nanoTime();
		double TempoQuickSort = TempoFinalqs - TempInicialqs;
		TempoQuickSort = TempoQuickSort / Math.pow(10, 9);
		System.out.println("Quick Sort: " + TempoQuickSort + "s");	
		
		
		
		// Bubble Sort
		

		ControllerB cb = new ControllerB();
		
		double TempInicialcb = System.nanoTime();
		cb.BubbleSort(vetb);

		double TempoFinalcb = System.nanoTime();
		double TempoBubbleSort = TempoFinalcb - TempInicialcb;
		TempoBubbleSort = TempoBubbleSort / Math.pow(10, 9);
		System.out.println("Bubble Sort: " + TempoBubbleSort + "s");
		
		
		//Merge Sort
		

		ControllerM cm = new ControllerM();
		
		int tamanhoC = vetc.length-1;
		double TempInicialcm = System.nanoTime();
		
		cm.MergeSort(vetc, 0, tamanhoC);

		double TempoFinalcm = System.nanoTime();
		double TempoMergeSort = TempoFinalcm - TempInicialcm;
		TempoMergeSort = TempoMergeSort / Math.pow(10, 9);
		System.out.println("Merge Sort: " + TempoMergeSort + "s");
	
	}

}
