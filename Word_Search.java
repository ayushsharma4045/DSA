/*
 * Problem Link: https://leetcode.com/problems/word-search/
 */
import java.io.*;
//import java.util.*;
class Word_Search {
    public static void main(String[] args)throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int m=Integer.parseInt(in.readLine());
        int n=Integer.parseInt(in.readLine());
        char board[][] = new char [m][n];
        for(int i=0;i<m;i++){
            String s [] = in.readLine().trim().split(" ");
            for(int j=0;j<n;j++){
                board[i][j]=s[j].charAt(0);
            }
        }
        String word=in.readLine();
        System.out.println(exist(board,word));
    }
    public static boolean exist(char[][] board, String word) {
        boolean visited[][]=new boolean[board.length][board[0].length];
        boolean res=false;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    res=back(board,word,visited,i,j,0);
                    if(res) 
                        return true;
                }
            }
        }
        return false;
    }
    public static boolean back(char[][]board,String word,boolean[][]visited,int i,int j,int ind){
        if(ind==word.length()){
            return true;
        }
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || visited[i][j] || board[i][j]!=word.charAt(ind)){
            return false;
        }
        visited[i][j]=true;
        if(back(board,word,visited,i+1,j,ind+1) ||
        back(board,word,visited,i+1,j,ind+1) ||
        back(board,word,visited,i-1,j,ind+1) ||
        back(board,word,visited,i,j+1,ind+1) ||
        back(board,word,visited,i,j-1,ind+1)){
            return true;
        }
        visited[i][j]=false;
        return false;
    }
}