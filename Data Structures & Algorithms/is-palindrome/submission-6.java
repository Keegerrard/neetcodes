class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==1)return true;
        s=s.toLowerCase();
        char[] ch = s.toCharArray();
        int left = 0;
        int right = ch.length -1;
        while(left<right){
            while((!Character.isLetterOrDigit(ch[left]))&& (left<right)){
                left++;
            }
            while((!Character.isLetterOrDigit(ch[right]))&& (right>left)){
                right--;
            }
            if(ch[right]!=ch[left])return false;
            left++;
            right--;
        }
        return true;
    }
}
