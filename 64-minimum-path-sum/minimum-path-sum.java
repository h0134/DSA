class Solution {
    public int minPathSum(int[][] grid) {
        int nrows = grid.length;
        int ncoln = grid[0].length;
        for(int i=1; i<ncoln;i++){
            grid[0][i]=grid[0][i-1]+grid[0][i];

        }
         for(int i=1; i<nrows;i++){
            grid[i][0]=grid[i-1][0]+grid[i][0];

        }

         for(int i=1; i<nrows;i++){
        for(int j=1; j<ncoln;j++){
            grid[i][j]=Math.min(grid[i][j]+grid[i-1][j],grid[i][j]+grid[i][j-1]);}
        
    }
return grid[nrows-1][ncoln-1];
}

}