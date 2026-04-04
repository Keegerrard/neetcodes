class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> hash = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(hash.contains(nums[i]))return nums[i];
            hash.add(nums[i]);
        }
        return 0;
    }
}
