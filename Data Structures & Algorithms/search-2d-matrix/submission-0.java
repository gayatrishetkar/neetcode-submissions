class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ROWS = matrix.length;
        int COLS = matrix[0].length;

        int l = 0;
        int h = ROWS-1;

        while(l<=h) {
            int m = (l+h)/2;

            if(target > matrix[m][COLS-1])
                l=m+1;
            else if(target < matrix[m][0])
                h=m-1;
            else
                break;
        }

        if(!(l<=h))
            return false;

        int row = (l+h)/2;

        int i = 0;
        int j = COLS-1;

        while(i<=j){
            int m = (i+j)/2;

            if(target > matrix[row][m])
                i = m+1;
            else if(target < matrix[row][m])
                j = m-1;
            else
                return true;
        }
        return false;
    }
}
