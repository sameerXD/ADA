import java.util.Random;
import java.util.Scanner;

public class Start {
	
	public static void printArray(int[] b) {
		for(int i = 0;i<b.length;i++) {
    		System.out.println(b[i]);
    	}
	}
	
    public static int[] inserionSort(int[] a) {
    	int key , i,j;
    	for( i=1;i<a.length;i++) {
    		key= a[i];
    		j = i-1;
    		
    		while(j>=0 && key<a[j]) {
    			a[j+1] = a[j];
    			j=j-1;
    		}
    		a[j+1] =key; 
    	}
    	return a;
    }
    
    public static int[] bubbleSort(int[] a) {
    	int i, j, temp,n= a.length; 
        boolean swapped; 
        for (i = 0; i < n - 1; i++)  
        { 
            swapped = false; 
            for (j = 0; j < n - i - 1; j++)  
            { 
                if (a[j] > a[j + 1])  
                { 
                    
                    temp = a[j]; 
                    a[j] = a[j + 1]; 
                    a[j + 1] = temp; 
                    swapped = true; 
                } 
            } 
  

            if (swapped == false) 
                break; 
        } 
    	return a;
    }
    
    public static int[] selectionSort(int[] a) {
    	for (int i = 0; i < a.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < a.length; j++){  
                if (a[j] < a[index]){  
                    index = j;
                }  
            }  
            int smallerNumber = a[index];   
            a[index] = a[i];  
            a[i] = smallerNumber;  
        }  
    	return a;
    }
    
    public static void main(String[] args) {
    	
    	Random rd = new Random(); 
        int[] a = new int[100];
        for (int i = 0; i < a.length; i++) {
           a[i] = rd.nextInt(); 
           System.out.println(a[i]); }
    	
    	System.out.println("press 1 for insertion sort");
    	System.out.println("press 2 for bubble sort");
    	System.out.println("press 3 for selection sort");
    	
    	Scanner scn = new Scanner(System.in);
    	int sn = scn.nextInt();
    	long start = System.nanoTime();
    	switch(sn) {
    	
    	case 1:int[] b = inserionSort(a);
    	printArray(b);
    	
    	break;
    	
    	case 2 :b =bubbleSort(a);
    	printArray(b);
    	break;
    	
    	case 3: b = selectionSort(a);
    	printArray(b);
    	break;
    	}
    	long finish = System.nanoTime();
    	long timeElapsed = finish - start;
    	System.out.println("time ---------------" + timeElapsed);
    }
}
