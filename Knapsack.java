
public class Knapsack {
	private int numOfItems;
	private int capacityOfKnapsack;
	private int[][] knapsackTable;
	private int[] weight;
	private int[] values;
	private int totalBenefit;

	public Knapsack(int numOfItems, int capacityOfKnapsack, int[][] knapsackTable, int[] weight, int[] values,
			int totalBenefit) {
		super();
		this.numOfItems = numOfItems;
		this.capacityOfKnapsack = capacityOfKnapsack;
		this.knapsackTable = new int[numOfItems+1][capacityOfKnapsack+1];
		this.weight = weight;
		this.values = values;
		this.totalBenefit = totalBenefit;
	}
	
	void solve() {
		for(int i = 1; i<numOfItems+1;i++) {
			for(int w = 1;w<capacityOfKnapsack+1;w++) {
				int notTakingItem = knapsackTable[i-1][w];
				int takingItem = 0;
				
				if(weight[i]<=w) {
					takingItem = values[i]+knapsackTable[i-1][w-weight[i]];
				}
				knapsackTable[i][w]  = Math.max(notTakingItem, takingItem);
			}
		}
		totalBenefit = knapsackTable[numOfItems][capacityOfKnapsack];
	}

	public static void main(String[] args) {
		


	}

}
