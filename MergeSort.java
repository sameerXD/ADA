
public class MergeSort {
	int[] array;
	int tempMergeArray[];
	int length;

	public static void main(String[] args) {
		int arr[] = {48,36,13,52,19,21,94};
		MergeSort ms = new MergeSort();
		ms.sort(arr);
		for(int h=0;h<arr.length;h++) {
			System.out.println(arr[h]);
		}

	}
	
	public void sort(int arr[]) {
		this.array= arr;
		this.length = array.length;
		this.tempMergeArray = new int[length];
		divideArray(0,length-1);
	}
	public void divideArray(int lowerIndex,int higherIndex) {
		if(lowerIndex<higherIndex) {
			int middleIndex = lowerIndex+(higherIndex-lowerIndex)/2;
			
			//left side
			divideArray(lowerIndex,middleIndex);
			
			//right side
			
			divideArray(middleIndex+1,higherIndex);
			
			mergeArray(lowerIndex,middleIndex,higherIndex);
		}
	}
	
	public void mergeArray(int lowerIndex,int middle, int higherIndex) {
		for(int i=lowerIndex;i<=higherIndex;i++) {
			tempMergeArray[i]= array[i];
		}
		int i = lowerIndex;
		int j= middle+1;
		int k = lowerIndex;
		
		while(i<=middle && j<=higherIndex) {
			if(tempMergeArray[i]<=tempMergeArray[j]) {
				array[k] = tempMergeArray[i];
				i++;
			}
			else {
				array[k] = tempMergeArray[j];
				j++;
			}
			k++;
		}
		
		while(i<=middle) {
			array[k]= tempMergeArray[i];
			k++;
			i++;
		}
	}

}
