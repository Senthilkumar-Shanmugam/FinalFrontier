package com.practise.sorting;

public class BubbleSort {

	public static void main(String[] args) {
       int a[]={12,11,13,5,6};
       System.out.println("\nInput array");
       display(a);
       bubbleforward(a);
       
       System.out.println("\nAfter sorting array");
       display(a);
       
	}
	
	/**
	 * moves the largest element to the last,one at a time
	 * needs n passes of an array of size n
	 * @param a
	 */
	private static void bubbleforward(int []a){
		int len=a.length;
		int ep = len -1; 
		boolean swap=false;
		for(int pass=1;pass<=len;pass++){
			for(int j=0;j<ep;j++){
				if(a[j]>a[j+1]){
					int tmp=a[j+1];
					a[j+1]=a[j];
					a[j]=tmp;
					swap=true;
				}
			}
			if(swap==false) break; // if there are no swaps in entire pass come out
	}
	}
	private static void bubbleback(int []a){
		
	}
	
	private static void recurbubble(int []a,int len){
		
	}
	
	private static void display(int []a){
		for(int i:a){
			System.out.print(" "+i);
		}
	}

}
