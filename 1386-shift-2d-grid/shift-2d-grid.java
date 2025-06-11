
import java.util.*;
class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        
        int n=grid.length;
        int m=grid[0].length;
        int [][]ans=new int[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                int I= (i+(j+k)/m)%n;
                int J= (j+k)%m;
                ans[I][J]=grid[i][j];
                }
        }
    
    List<List<Integer>> list = Arrays.stream(ans)
                                         .map(row -> Arrays.stream(row).boxed().collect(Collectors.toList()))
                                         .collect(Collectors.toList());

    
    return list;
}}