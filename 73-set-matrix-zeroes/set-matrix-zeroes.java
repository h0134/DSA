class Solution {
    public void setZeroes(int[][] matrix) {
        int nrows = matrix.length;
        int ncols = matrix[0].length;
        List<Integer> rows = new ArrayList<>();
        List<Integer> cols = new ArrayList<>();

        for(int i=0;i<nrows;i++){
            for(int j=0;j<ncols;j++){
                if(matrix[i][j]==0){
                  rows.add(i);
                 cols.add(j);
     
              }
            }
        }

  for(int ele:rows){
            for(int i=0;i<ncols;i++){
matrix[ele][i]=0;
            }
                    
    }
      for(int ele:cols){
            for(int i=0; i<nrows;i++){
matrix[i][ele]=0;
            }
                    
    }
}}