import java.util.Scanner;

public class ShortestPath {
	public static void dijkstro (int [][] adjancyMatrix) {
		int v = adjancyMatrix.length;
		boolean visited[] = new boolean [v];
		int distance[] = new int [v];
		distance[0]= 0;
		for(int i =0 ; i<v;i++) {
			distance[i]= Integer.MAX_VALUE;
		}
		for(int i = 0 ; i<v-1;i++) {
			//vertex wth minimum distance
			int minVertex = findMinvertex(distance,visited);
			//explore neighbors
			
			for(int j= 0 ; j<v ; j++) {
				if(adjancyMatrix[minVertex][j]!=0  && !visited[j]  && distance[minVertex]!= Integer.MAX_VALUE) {
					int newDist = distance[minVertex]+ adjancyMatrix[minVertex][j]; 
					if(newDist<distance[j]) {
						distance[j]= newDist;
					}
				}
			}
			
			
		}
		//print
		
		for(int k = 1; k<v;k++) {
			System.out.println(k + " " + distance[k]);
		}
		
	}
	
	private static int findMinvertex(int[] distance, boolean[] visited) {
		// TODO Auto-generated method stub
		int minVertex = -1;
		for(int i=0;i<distance.length;i++) {
			if(!visited[i] && (minVertex ==-1|| distance[i]<distance[minVertex])) {
				minVertex = i;
			}
		}
		return minVertex;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int e =sc.nextInt();
		
		int adjancyMatrix[][]= new int[v][e];
		
		for(int i = 0;i<e;i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			int weight = sc.nextInt();
			
			adjancyMatrix[v1][v2] = weight;
			adjancyMatrix[v2][v1] = weight;
			dijkstro (adjancyMatrix);
		}
		
	}
}
