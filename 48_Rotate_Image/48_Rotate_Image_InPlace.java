class Solution {
    //T.C. : O(N*N)
    // S.C. : O(1)
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // divide the matrix into squares or cycle. 
        // NXN matrix will have N/2 squares.
        // start from the oth row
        for(int i = 0; i < n/2; i++) {
            // start from the rowth column
            for(int j = i; j < n-i-1; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n-1-j][i];
                matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
                matrix[j][n-1-i] = temp;
            }
        }
        
    }
}
