class Solution {
    public boolean isValidSudoku(char[][] board) {
        

        for (int i=0;i<9;i++) {
            HashSet<Integer> set=new HashSet<>();
            for (int j=0;j<9;j++) {
                if(board[i][j]=='.') continue;
                int num=board[i][j]-'0';
                if (set.add(num)==false) return false;
                if(num<1 || num>9 ) return false;
            }
        }

        for (int i=0;i<9;i++) {
            HashSet<Integer> set=new HashSet<>();
            for (int j=0;j<9;j++) {
                if(board[j][i]=='.') continue;                
                int num=board[j][i]-'0';
                if (set.add(num)==false) return false;
                if(num<1 || num>9 ) return false;
            }
        }

        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {

            HashSet<Integer> set = new HashSet<>();

            for (int r = i; r < i + 3; r++) {
                for (int c = j; c < j + 3; c++) {

                    if (board[r][c] == '.') continue;

                    int num = board[r][c] - '0';

                    if (set.add(num) == false) return false;
                    if (num < 1 || num > 9) return false;
                }
            }
        }
    }

    return  true;
    }
}
