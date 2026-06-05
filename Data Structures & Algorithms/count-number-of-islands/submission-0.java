class Solution {
    int[][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}};
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int islandCount = 0;
        Set<String> visited = new HashSet<>();

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(grid[i][j]=='1' && !visited.contains(i+","+j)){
                    bfs(i, j, rows, cols, grid, visited);
                    islandCount++;
                }
            }
        }
        return islandCount;
    }

    public void bfs(int i, int j, int rows, int cols, char[][] grid, Set<String> visited){
        Queue<int[]> q = new LinkedList<>();
        visited.add(i+","+j);
        q.add(new int[]{i,j});

        while(!q.isEmpty()){
            int[] element = q.poll();
            int row = element[0];
            int col = element[1];

            for(int[] direction : directions){
                int nr = row+direction[0];
                int nc = col+direction[1];

                if(nr>=0 && nr<rows && nc>=0 && nc<cols && grid[nr][nc]=='1' && !visited.contains(nr+","+nc)){
                    q.add(new int[]{nr, nc});
                    visited.add(nr+","+nc);
                }
            }
        }
    }
}
