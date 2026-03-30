class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i<tokens.length;i++){       
            if(tokens[i].equals("+")){
                int op1 = stack.pop() ;
                int op2 = stack.pop() ;
                int calculate = op2 + op1;
                stack.push(calculate);   
            }
            else if(tokens[i].equals("-")){
                int op1 = stack.pop() ;
                int op2 = stack.pop() ;
                int calculate = op2 - op1;
                stack.push(calculate);   
            }
            else if(tokens[i].equals("*")){
                int op1 = stack.pop() ;
                int op2 = stack.pop() ;
                int calculate = op2 * op1;
                stack.push(calculate);   
            }
            else if(tokens[i].equals("/")){
                int op1 = stack.pop();
                int op2 = stack.pop();
                if(op1 == 0)return 0;
                int calculate = op2 / op1;
                stack.push(calculate);   
            }
            else{
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.pop();
    }
}
