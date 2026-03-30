class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        Set<Character> window = new HashSet<>();
        int l=0,r=0,best=0;
        while(r<arr.length){
            
            while(window.contains(arr[r])){
                window.remove(arr[l]);
                l++;
            }
            window.add(arr[r]);
            best=Math.max(best,(r-l+1));
            r++;
        }
        return best;
    }
}
