class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i = 0; i<nums.length;i++){
            int mult= 1;
            for(int j = 0; j<nums.length;j++){
                if(j==i)continue;
                else{
                    mult *= nums[j];
                }
            }
            arr[i]=mult;
        }
        return arr;
    }
}  
