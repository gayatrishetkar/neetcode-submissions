class Solution {

    int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};

    public int maxAreaOfIsland(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int maxArea = 0;
        Set<String> visited = new HashSet<>();

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(grid[i][j]==1 && !visited.contains(i+","+j)){
                   int area = bfs(i, j, rows, cols, grid, visited);
                   maxArea = Math.max(area, maxArea);
                }
            }
        }
        return maxArea;
    }

    public int bfs(int i, int j, int rows, int cols, int[][] grid, Set<String> visited){
        int area = 1;
        Queue<int[]> q = new LinkedList<>();
        visited.add(i+","+j);
        q.add(new int[]{i,j});

        while(!q.isEmpty()){
            int[] poll = q.poll();

            for(int[] direction : directions){
                int x = poll[0]+direction[0];
                int y = poll[1]+direction[1];

                if(x>=0 && x<rows && y>=0 && y<cols && grid[x][y]==1 && !visited.contains(x+","+y)){
                    q.add(new int[]{x,y});
                    visited.add(x+","+y);
                    area++;
                }
            }
        }
        return area;
    }
}
