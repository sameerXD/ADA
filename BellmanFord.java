
//public class BellmanFord {
	
	class BellmanFord{
		class Edge{
			int bigg ;
			int end;
			int weight;
			Edge(){
				bigg = end = weight = 0;
			}
			
		};
		
		int vertice, ed;
		Edge edge[];
		
		BellmanFord(int v, int e){
			vertice = v;
			ed = e;
			
			edge = new Edge[e];
			
			for(int i =0 ;i<e;++i) {
				edge[i]= new Edge();
			}
		}
		
		void BellmanFordAlgo(BellmanFord graph , int src) {
			int V = graph.vertice, E = graph.ed;
			int dist[] = new int[V];
			
			
			for(int i = 0 ; i<V; ++i) 
				dist[i] = Integer.MAX_VALUE;
			dist[src]= 0;	
			
			for (int i= 1; i<V;++i) {
				for(int j=0;j<E;++i) {
					int u = graph.edge[j].bigg;
					int v = graph.edge[j].end;
					int weight = graph.edge[j].weight;
					if (dist[u]!= Integer.MAX_VALUE && dist[u]+ weight<dist[v] ) {
						dist[v] = dist[u] + weight;
					}
				}
			}
			
			
			for(int j = 0; j<E ; ++j) {
				int u = graph.edge[j].bigg;
				int v = graph.edge[j].end;
				int weight = graph.edge[j].weight;
				
				if (dist[u]!= Integer.MAX_VALUE  && dist[u] +weight <dist[v]) {
					System.out.println("graph has negative value ");
					return;
				}
			}
			
			printArr(dist,V);
			
		}

		private void printArr(int[] dist, int v) {
			// TODO Auto-generated method stub
			for (int i= 0 ;i<v ;++i) {
				System.out.println(i + "  " + dist[i]);
			}
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int V = 5;
		int E = 8;
		
		
		BellmanFord graph = new BellmanFord(V,E);
		
		graph.edge[0].bigg = 0;
		graph.edge[0].end = 1;
		 graph.edge[0].weight = -1; 
		  
	        
	        graph.edge[1].bigg= 0; 
	        graph.edge[1].end = 2; 
	        graph.edge[1].weight = 4; 
	  
	        
	        graph.edge[2].bigg = 1; 
	        graph.edge[2].end = 2; 
	        graph.edge[2].weight = 3; 
	  
	        
	        graph.edge[3].bigg = 1; 
	        graph.edge[3].end = 3; 
	        graph.edge[3].weight = 2; 
	  
	        
	        graph.edge[4].bigg = 1; 
	        graph.edge[4].end = 4; 
	        graph.edge[4].weight = 2; 
	  
	        
	        graph.edge[5].bigg = 3; 
	        graph.edge[5].end = 2; 
	        graph.edge[5].weight = 5; 
	  
	        
	        graph.edge[6].bigg = 3; 
	        graph.edge[6].end = 1; 
	        graph.edge[6].weight = 1; 
	  
	       
	        graph.edge[7].bigg = 4; 
	        graph.edge[7].end = 3; 
	        graph.edge[7].weight = -3; 
	  
	        graph.BellmanFordAlgo(graph, 0); 
		

	}

}
