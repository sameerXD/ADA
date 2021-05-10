import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class BoxMuller {
	  public static int getMax(int[] inputArray){ 
		    int maxValue = inputArray[0]; 
		    for(int i=1;i < inputArray.length;i++){ 
		      if(inputArray[i] > maxValue){ 
		         maxValue = inputArray[i]; 
		      } 
		    } 
		    return maxValue; 
		  }
	  
	  public static int getMin(int[] inputArray){ 
		    int minValue = inputArray[0]; 
		    for(int i=1;i<inputArray.length;i++){ 
		      if(inputArray[i] < minValue){ 
		        minValue = inputArray[i]; 
		      } 
		    } 
		    return minValue; 
		  } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[1200]; 
		int sum=0 , d = 0,t=0;
		int[]box = new int[100];
		int[]fin = new int[100];
		for (int i =0; i<1200;i++) {
		int randomNum = ThreadLocalRandom.current().nextInt(100, 10000);
		arr[i] = randomNum;
		}
		System.out.println("array length" +arr.length);
		
		
		for(int i = 0 ; i<=1200;i++) {
			 
			
			if(i%12==0 && i!=0) {
				d = sum/6;
				System.out.println("sum divided by 6 "+d);
				box[t] = d;
				sum = 0;
				t++;
			}else {
			
			sum = sum +arr[i];
			
		
			System.out.println(sum);
			 
		}}
		
		System.out.println("box muller array ------------");
		for(int x: box) {
			System.out.println(x);
		}
		
		int min = getMin(box);
		int max = getMax(box);
		int range = (max-min)/10;
		int temp = min;
		
		System.out.println("the min and max value of box muller array "+ min + " " + max);
		System.out.println("range of array "+range);
		
		
		while(temp<=max) {
			int r = temp + range;
			System.out.println("between " + temp +" and" + r);
			for(int i = 0; i<box.length ; i++) {
				if(box[i]>=temp && box[i]<r) {
					//System.out.println(box[i]);
					fin[i] = box[i];
				}
				
			}
			temp = r;
			System.out.println("temp " +temp);
			for(int x : fin) {
				if(x!=0) {
				System.out.println(x);
				}
			}
			fin = new int[100];
		}
		

	}

}
