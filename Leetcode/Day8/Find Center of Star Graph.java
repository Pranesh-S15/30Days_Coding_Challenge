//Optimal
class Solution {
    public int findCenter(int[][] edges) {
        int u=edges[0][0];
        int v=edges[0][1];

        if(u==edges[1][0] || u==edges[1][1])
            return u;
        else
            return v;
    }
}

//AnotherCode
class Solution {
    public int findCenter(int[][] edges) {
        int n = edges.length + 1;
        int[] degreeCount = new int[n + 1];
        
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            degreeCount[u]++;
            degreeCount[v]++;
        }
        
        for (int i = 1; i <= n; i++) {
            if (degreeCount[i] == n - 1) {
                return i;
            }
        }
        
        return -1;
    }
}
