public class search_2d_array {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int row = matrix.length;
        int col = matrix[0].length;

        int low =0;
        int high = (row * col) - 1;

        while(low <= high){
            int mid = (low + (high - low)/2);

            if(matrix[mid/col][mid%col] == target){
                return true;
            }else if(matrix[mid/col][mid%col] < target){
                low = mid +1;
            }else{
                high = mid - 1;
            }
        }
        return false;
    }
}
