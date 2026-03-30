class Solution {
    public int findMin(int[] nums) {
        int l=0, r = nums.length-1;
        int res = 1000;
        while(l<=r){
            int mid = (l+r)/2;
            res = Math.min(res,nums[mid]);
            res = Math.min(res,nums[l]);
            res = Math.min(res,nums[r]);
            if(nums[l]<nums[mid]){
                l=mid+1;
            }
            else{
                r = mid-1;
            }
        }
        return res;
    }
}
