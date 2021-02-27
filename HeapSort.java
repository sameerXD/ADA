
public class HeapSort {
	int temp;
	void heapify(int arr[], int size,int i) {
		int largest = i;//parent node index position
		int left = 2*i+1;
		int right = 2*i+2;
		
		if(left<size&& arr[left]>arr[largest])
			largest = left;
		
		if(right<size && arr[right]>arr[largest])
			largest = right;
		
		if(largest != i) {
			temp = arr[i];
			arr[i] = arr[largest];
			arr[largest]= temp;
			heapify(arr,size,largest);
			
		}
	}
	
	void sort(int[] arr) {
		int length = arr.length;
		
		for (int i =length/2-1;i>=0;i-- )//bec length/2-1 give the right subtree parent indexx
		{
			heapify(arr,length,i);
		}
		
		//swap the parent with last and heapify
		for(int i = length -1 ; i>=0;i--) {
			temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			
			heapify(arr,i,0);
		}
	}
	
	void printArray(int arr[]) {
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		int arr [] = {22,13,17,11,10,14,12};
		HeapSort hs = new HeapSort();
		hs.sort(arr);
		hs.printArray(arr);

	}

}
