class Solution {
    public boolean isValid(String s) {
        Stack<Character> temp = new Stack<>();
        char[] n = s.toCharArray();
        for(int i =0;i<n.length;i++){
            char c = n[i];
            if(c == '('|| c == '['|| c== '{') temp.push(c);
            else{
                if(temp.isEmpty())return false;
                if(c == ')' && (temp.peek()!='(')) return false;
                else if (c == ']' && (temp.peek()!='[')) return false;
                else if (c == '}' && (temp.peek()!='{')) return false;
                else temp.pop();
            }
        }
        return(temp.isEmpty());
    }
}
