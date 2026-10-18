class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 ||
                matrix[0].length == 0) {
            return false;
        }
        int n = matrix.length - 1;
        int m = matrix[0].length - 1;

        if (target < matrix[0][0] || target > matrix[n][m]) {
            return false;
        }

        int left = 0;
        int right = n;
        
        while(left<=right){
            int mid = left + (right-left)/2;
            if(target == matrix[mid][0]){
                return true;
            }
            else if(target > matrix[mid][0]){
                if(target <= matrix[mid][m]){
                    return isPersent(matrix,target,mid);
                }
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return false;
    }
    private boolean isPersent(int[][] matrix, int target, int row){
        int m = matrix[row].length;
        int left = 0;
        int right = m - 1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(target == matrix[row][mid]){
                return true;
            }else if(target < matrix[row][mid]){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return false;
    }
}
