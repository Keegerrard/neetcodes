class Solution {
    public boolean isValidSudoku(char[][] board) {
        //check Row
        for(int i =0; i<9;i++){
            Set<Integer> row = new HashSet<>();
            for(int j =0;j<9; j++){
                if(board[i][j]=='.')continue;
                if(!row.add((int) board[i][j])){
                    return false;
                }
                
            }
        }
        //Check Column
        for(int i =0; i<9;i++){
            Set<Integer> column = new HashSet<>();
            for(int j =0;j<9; j++){
                if(board[j][i]=='.')continue;
                if(!column.add((int) board[j][i])){
                    return false;
                }
            }
        }
        //check box
        for(int a=0;a <9;a=a+3){
            for(int b=0;b<9;b=b+3){
                Set<Integer> box = new HashSet<>();
                for(int c = a;c<a+3;c++){
                    for(int d = b;d<b+3;d++){
                        if(board[c][d]=='.')continue;
                        if(!box.add((int) board[c][d])){
                            return false;
                        }   
                    }
                }
            }
        }
    return true;
    }
}
