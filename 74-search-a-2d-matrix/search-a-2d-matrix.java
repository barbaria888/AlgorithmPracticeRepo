class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int start = 0;
        int end = rows*cols-1;
        
        while(start<=end)
        {
            int mid= end - ( end-start )/2;
            
            int row=mid/cols;
            int col=mid%cols;
            int curr=matrix[row][col];
            if(curr==target)
            {
                return true;
            }
            else if(curr < target)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
            
        }
        return false;
    }
}