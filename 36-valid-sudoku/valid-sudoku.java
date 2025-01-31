class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean [][]rows= new boolean[9][9];
        boolean [][]cols= new boolean[9][9];
        boolean [][]sideboxes= new boolean[9][9];        
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)   
            {     
                char curr=board[i][j];
                
                if(curr!='.')
                {
                    int num= curr-'1';
                    int boxind= (i/3)*3+(j/3);
                    if(rows[i][num]||cols[j][num]||sideboxes[boxind][num])
                    {
                        return false;
                    }
                    rows[i][num]=true;
                    cols[j][num]=true;
                    sideboxes[boxind][num]=true;
                }
            }
        }
        return true;
    }
}