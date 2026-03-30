class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> st = new HashSet<>();
        int l =0, r =0;
        int max = 0;
        while(r<s.length()){
            char c = s.charAt(r);
            if(st.contains(c)){
                max = Math.max(max, st.size());
                if(l<=r){
                    st.remove(s.charAt(l++));
                }
            }else{
                st.add(c);
                r++;
            }
            
        }
        max = Math.max(max, st.size());
        return max;
    }
}
