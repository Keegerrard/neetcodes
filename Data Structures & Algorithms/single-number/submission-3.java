class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> check = new HashSet<>();
        for(int n : nums){
            if(check.contains(n))check.remove(n);
            else check.add(n);
        }
        for(int n : nums){
            if(check.contains(n))return n;
        }
        return -1;
    }
}
