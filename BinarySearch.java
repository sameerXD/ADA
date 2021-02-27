
public class BinarySearch {
	int binarySearch(int arr[], int l, int r  , int x) {
		if(r>=l) {
			int mid = l+(r-1)/2;
			
			if(arr[mid]==x) {
				return mid;
			}
			
			if(arr[mid]<x) {return binarySearch(arr,mid+1,r,x);}
			
			return binarySearch(arr,l,mid-1,x);
			
		}
		return -1;
	}
	
	public static void main (String [] args) {
		BinarySearch bs = new BinarySearch();
		int arr[] = {2,3,4,10,40};
		int n = arr.length;
		int x = 10;
		int result = bs.binarySearch(arr, 0, n-1,x );
		
		if (result==-1)
			System.out.println("element not found");
		else
			System.out.println("element found at "+ result);
	}

}
