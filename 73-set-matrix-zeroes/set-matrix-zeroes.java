class Solution {
    public void setZeroes(int[][] matrix) {
        int nrows = matrix.length;
        int ncolumns = matrix[0].length;
        List<Integer> rows = new ArrayList<>();
        List<Integer> columns = new ArrayList<>();
        for(int i=0;i<nrows;i++){
            for(int j=0;j<ncolumns;j++){
                if(matrix[i][j]==0){
                    rows.add(i);
                    columns.add(j);
                }
            }
        }
              for(int i=0;i<nrows;i++){
                    for(int j=0;j<ncolumns;j++){
                         if(rows.contains(i) || columns.contains(j)) {
                            matrix[i][j]=0;


           }
           
            }}
        }}

        
    
