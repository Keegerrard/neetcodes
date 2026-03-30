class Solution {
    public boolean isAnagram(String s, String t) {
        int[] s1 = new int[26];
        int[] s2 = new int[26]; 

        for(char alfa : s.toCharArray()){
            int x = alfa - 97;
            s1[x]++;
        }
        for(char alfa2 : t.toCharArray()){
            int y = alfa2 - 97;
            s2[y]++;
        }
        for(int z =0; z<26; z++){
            if(s1[z]!=s2[z])return false;
        }
        return true;
    }

}
