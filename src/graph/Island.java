package graph;

public class Island {
    public static void main(String[] args) {
        char grid[][] = {
                {'L','L','W','W','W'},
                {'W','L','W','W','L'},
                {'L','W','W','L','L'},
                {'W','W','W','W','W'},
                {'L','W','L','L','W'}
        };
        System.out.println(countOfIslands(grid));
    }

    private static int countOfIslands(char[][] grid){
        if(grid==null || grid.length==0){
            return 0;
        }
        int noOfRows = grid.length;
        int noOfCols = grid[0].length;
        int noOfIslands = 0;

        for(int r=0;r<noOfRows;r++){
            for(int c=0;c<noOfCols;c++){
                if(grid[r][c]=='L'){
                    noOfIslands++;
                    dfs(grid,r,c);
                }
            }
        }
        return noOfIslands;
    }

    private static void dfs(char[][] grid,int row,int col){
        int noOfRows = grid.length;
        int noOfCols = grid[0].length;
        if(row<0 || row>=noOfRows || col<0 || col>=noOfCols || grid[row][col]=='W'){
            return;
        }
        grid[row][col] = 'W';
        dfs(grid,row+1,col);
        dfs(grid,row-1,col);
        dfs(grid,row,col+1);
        dfs(grid,row,col-1);
    }
}
