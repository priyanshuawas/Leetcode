package Medium;
class Problem417 {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;
        
        boolean[][] pacVis = new boolean[m][n];
        boolean[][] atlVis = new boolean[m][n];
        
        for (int i = 0; i < n; i++) {
            dfs(0, i, Integer.MIN_VALUE, heights, pacVis);
        }
        
        for (int i = 1; i < m; i++) {
            dfs(i, 0, Integer.MIN_VALUE, heights, pacVis);
        }
        
        for (int i = 0; i < n; i++) {
            dfs(m - 1, i, Integer.MIN_VALUE, heights, atlVis);
        }
        
        for (int i = 0; i < m - 1; i++) {
            dfs(i, n - 1, Integer.MIN_VALUE, heights, atlVis);
        }
        
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pacVis[i][j] && atlVis[i][j]) {
                    result.add(List.of(i, j));
                }
            }
        }
        
        return result;
    }
    
    
    private void dfs(int r, int c, int preVal, int[][] heights, boolean[][] visited) {
        if (r < 0 || c < 0 || r >= heights.length || c >= heights[0].length
           || visited[r][c] || !(preVal <= heights[r][c])) {
            return;
        }
        
        visited[r][c] = true;
        int val = heights[r][c];
        dfs(r - 1, c, val, heights, visited);
        dfs(r + 1, c, val, heights, visited);
        dfs(r, c - 1, val, heights, visited);
        dfs(r, c + 1, val, heights, visited);
    }
}