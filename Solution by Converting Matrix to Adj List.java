class Solution {

    public static void dfs(int index, List<Integer>[] adjsLs, boolean[] visited) {
        visited[index] = true;
        for(int it : adjsLs[index]) {
            if(!visited[it]){
                dfs(it, adjsLs, visited);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        int V = isConnected.length;
        List<Integer>[] adjsLs = new ArrayList[V];

        for(int i = 0; i < V; i++){
            adjsLs[i] = new ArrayList<>();
        }
        // Convert our matrix to adjList
        for(int i = 0; i < V; i++) {
            for(int j = 0; j < V; j++) {
                if(isConnected[i][j] == 1 && i != j) {
                    adjsLs[i].add(j);
                }
            }
        }
        boolean[] visited = new boolean[V];
        int count = 0;
        for(int i = 0; i < V; i++) {
            if(!visited[i]) {
                count++;
                dfs(i, adjsLs, visited);
            }
        }
        return count;
    }
}
