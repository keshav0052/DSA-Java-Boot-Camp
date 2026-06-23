class Solution {

    public static void dfs(int index, int[][] isConnected, boolean[] visited) {
        visited[index] = true;
        for(int j = 0; j < isConnected.length; j++) {
            if(isConnected[index][j] == 1 && !visited[j]){
                dfs(j, isConnected, visited);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
      int n = isConnected.length;
      boolean[] visited = new boolean[n];
      int count = 0;

      for(int i = 0; i < n; i++) {
        if(!visited[i]) {
            visited[i] = true;
            dfs(i, isConnected, visited);
            count++;
        }
      }  
      return count;
    }
}
