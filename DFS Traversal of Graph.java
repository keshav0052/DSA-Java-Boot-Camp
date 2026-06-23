class Solution {
    
    public static void dfs(int node, ArrayList<ArrayList<Integer>> adj, 
                            boolean[] visited, ArrayList<Integer> ans)   {
        visited[node] = true;
        ans.add(node);
        
        for(int it : adj.get(node)){
            if(!visited[it]){
                dfs(it, adj, visited, ans);
            }
        }
    } 
    
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int n = adj.size();
        boolean[] visited = new boolean[n];
        ArrayList<Integer> ans = new ArrayList<>();
        dfs(0, adj, visited, ans);
        return ans;
    }
}
