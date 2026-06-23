class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int n = adj.size();
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n];
        ArrayList<Integer> ans = new ArrayList<>();
        q.add(0);
        visited[0] = true;
        
        while(!q.isEmpty()) {
            int node = q.poll();
            ans.add(node);
            
            for(int it : adj.get(node)) {
                if(!visited[it]){
                    visited[it] = true;
                    q.add(it);
                }
            }
        }
        return ans;
    }
}
