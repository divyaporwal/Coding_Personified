/*
class Solution {
    public void setZeroes(int[][] matrix) {
        
        
        // Approach 1 : using additional memory
        
        // T.C. = O(MxN)
        // S.C. = O(M+N)
        
        int rows = matrix.length;
        int columns = matrix[0].length;
        
        Set<Integer> R = new HashSet<Integer>();
        Set<Integer> C = new HashSet<Integer>();
        
        
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if(matrix[i][j] == 0) {
                    R.add(i);
                    C.add(j);
                }
            }
        }
        
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                if(R.contains(i) || C.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }     
}
*/

/*

Approach 2
class Solution {
    public void setZeroes(int[][] matrix) {
        
        // APproach 2
        // Time Complexity = O(MxN) * (M+N)
        // Space Complexity = O(1)
        
        // keeping a dummy value which is outside the constraints
        int dummy = -1000000000;
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        for(int i = 0; i < rows; i++) {
            for(int j = 0 ; j < cols; j++) {
                if(matrix[i][j] == 0) {
                    for(int k = 0; k < cols; k++) {
                        if(matrix[i][k] != 0)
                            matrix[i][k] = dummy;
                    }
                    
                    for(int k = 0; k < rows; k++) {
                        if(matrix[k][j] != 0) {
                            matrix[k][j] = dummy;
                        }
                    }
                }
            }
        }
        
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(matrix[i][j] == dummy) {
                    matrix[i][j] = 0;
                }
            }
        }
        
    }
}

*/


/**

        Time complexity : O(M*N)
        Space Complexity : O(1)
        
        */
class Solution {
    public void setZeroes(int[][] matrix) {
        boolean is_col = false;
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        for(int i = 0; i < rows; i++) {
            if(matrix[i][0] == 0) {
                is_col = true;
            }
            
            for(int j = 1; j < cols; j++) {
                if(matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        
        for(int i = 1; i < rows; i++) {
            for( int j = 1; j < cols; j++) {
                if(matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        
        if(matrix[0][0] == 0) {
            for(int j = 0; j < cols; j++) {
                matrix[0][j] = 0;
            }
        }
        
        if(is_col) {
            for(int i = 0; i < rows; i++) {
                matrix[i][0] = 0;
            }
        }
        
    }
}

