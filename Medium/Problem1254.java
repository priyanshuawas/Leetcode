package Medium;

class Problem1254 {
    public int closedIsland(int[][] grid) {
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[i].length;j++){
                if(i != 0 && j != 0 && i != grid.length-1 && j != grid[0].length-1){
                    continue;
                }
                else{
                    dfs(grid,i,j);
                }
            }
        }
        int count = 0;
        for(int i = 1;i<grid.length-1;i++){
            for(int j = 1;j<grid[i].length-1;j++){
                if(grid[i][j] == 0){
                    count++;
                    dfs(grid,i,j);
                }
            }
        }
        return count;
    }
    void dfs(int[][] grid,int i,int j){
        if(i<0 || j <0 || i == grid.length || j == grid[i].length || grid[i][j] == 1){
            return;
        }
        grid[i][j] = 1;
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
    }
}