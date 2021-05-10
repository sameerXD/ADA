
public class Zero1Knapsack {
	
	 static int max(int a, int b) 
	    { 
		  if(a>b) {return a;}else {
			  return b;
		  }}
		  
//		  public static int knapsack(int W, int wt[] , int val[],int n ) {
//			  if (n == 0 || W == 0)
//		            return 0;
//			  
//			  if (wt[n - 1] > W)
//		            return knapsack(W, wt, val, n - 1);
//			  
//			  else
//				  System.out.println("selected item"+ max(val[n - 1]
//		                       + knapsack(W - wt[n - 1], wt,
//		                                  val, n - 1),
//		                       knapsack(W, wt, val, n - 1)));
//		            return max(val[n - 1]
//		                       + knapsack(W - wt[n - 1], wt,
//		                                  val, n - 1),
//		                       knapsack(W, wt, val, n - 1));
//			  
//		  }
	 
	 
	static void printknapSack(int W, int wt[],int val[], int n){ 
       int i, w; 
       int K[][] = new int[n + 1][W + 1]; 

 
         for (i = 0; i <= n; i++) { 
           for (w = 0; w <= W; w++) { 
             if (i == 0 || w == 0) 
             K[i][w] = 0; 
             else if (wt[i - 1] <= w) 
                 K[i][w] = Math.max(val[i - 1] +  
                 K[i - 1][w - wt[i - 1]], K[i - 1][w]); 
             else
               K[i][w] = K[i - 1][w]; 

} 
         }
         int res = K[n][W]; 
         System.out.println(res); 
   
         w = W; 
         for (i = n; i > 0 && res > 0; i--) { 
   
           
             if (res == K[i - 1][w]) 
                 continue; 
             else { 
            	 System.out.println("index selected");
            	 System.out.println("index number " + i);
   
                 
                 System.out.println(wt[i - 1] + " "); 
   
                 
                 res = res - val[i - 1]; 
                 w = w - wt[i - 1]; 
             } 
         } 
     } 
	
	    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val[] = new int[] { 20, 200, 320 };
        int wt[] = new int[] { 30, 20, 30 };
        int W = 50;
        int n = val.length;
         
        System.out.println("profit");
        printknapSack(W, wt, val, n); 

	}

}
