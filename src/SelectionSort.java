package controller;

import java.util.Random;

public class SelectionSort {

	public static void main(String[] args) {
		Random generator = new Random();
		int v[] = new int[10];
		
		// Filling the vector
		for(int i=0; i<v.length; i++) v[i] = generator.nextInt(26);
		
		// Showing the vector before sorting
		System.out.printf("Out of order: ");
		for(int i=0; i < v.length; i++) System.out.printf("%d ", v[i]);
		
		selectionSort(v);
		
		// Showing the vector after sorting 
		System.out.printf("\n\nSorted: ");
		for(int i=0; i < v.length; i++) System.out.printf("%d ", v[i]);
	}
	
	public static void selectionSort(int v[]){
		int elements = v.length, aux, min;
		
		for(int i=0 ; i < elements; i++){
			min=i;
			for(int j=i+1 ; j < elements ; j++){

				// The operator turned to the right puts the vector in ascending order
				// The operator facing left puts the vector in descending order
				
				if(v[min] > v[j]) min = j;
				
			}
			if(v[min] != v[i]){
				aux = v[min];
				v[min] = v[i];
				v[i] = aux;
			}
		}
	}
}