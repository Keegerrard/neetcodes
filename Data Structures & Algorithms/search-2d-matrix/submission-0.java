class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0;
        int r = matrix.length-1;
        while (l<=r){
            int mid = (l+r)/2;
            if(matrix[mid][0]<=target&& target<= matrix[mid][(matrix[mid].length)-1]){
                int left = 0;
                int right = matrix[mid].length-1;
                while(left<=right){
                    int m = (left+right)/2;
                    if(matrix[mid][m]==target)return true;
                    else if(matrix[mid][m]<target)left=m+1;
                    else right=m-1;
                }
                return false;
            }
            else if(matrix[mid][(matrix[mid].length)-1]>target)r=mid-1;
            else l=mid+1;
        }
        return false;
    }
}
