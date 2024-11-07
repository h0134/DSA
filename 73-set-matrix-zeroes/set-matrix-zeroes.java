class Solution {
    public void setZeroes(int[][] matrix) {
        int nrows = matrix.length;
        int ncolms = matrix[0].length;
       List<Integer> rows = new ArrayList<>();
       List<Integer> colmns= new ArrayList<>();

        for (int i =0; i <nrows;i++){
            for(int j =0; j<ncolms;j++){
                if(matrix[i][j]==0){
                    rows.add(i);
                    colmns.add(j);

                }
            }
        }

     
      for (int i =0; i <nrows;i++){
            for(int j =0; j<ncolms;j++){
                if(rows.contains(i) || colmns.contains(j) ){
          matrix[i][j]=0;

                }
            }
        }

        
    }
}