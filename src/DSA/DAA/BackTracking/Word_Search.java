package DAA.BackTracking;

import java.util.Arrays;

public class Word_Search {
    public static void main(String [] args){
        char c[][]={
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };
        String s="ABCB";
        System.out.print(exist(c,s));
    }
    public static boolean exist(char[][] board, String word) {
    int  vis[][]=new int[3][4];
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                if(board[i][j]==word.charAt(0)) {
                    if (find(i, j, board, word, 0, vis)) {
                        return true;
                    }
                }
            }
        }
        return false;
        }
        public static boolean find(int i,int j,char [][] c,String w,int k,int[][] vis){
        System.out.println(Arrays.deepToString(vis));
            int m=c.length;
            int n=c[0].length;
            if(k==w.length()){
                return true;
            }
            char ch=w.charAt(k);
            if(i<0 || i>=m||j<0||j>=n||vis[i][j]==1||c[i][j]!=ch )return false;
            vis[i][j]=1;
            if(find(i+1,j,c,w,k+1,vis))return true;
            if(find(i,j+1,c,w,k+1,vis))return true;
            if(find(i-1,j,c,w,k+1,vis))return true;
            if(find(i,j-1,c,w,k+1,vis))return true;
            vis[i][j]=0;
            return false;
        }
}
