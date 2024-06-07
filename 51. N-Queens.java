/*
 * Problem Link: https://leetcode.com/problems/n-queens/
 */
import java.util.*;
import java.io.*;
class Solution {
    public static void main(String[] args)throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-->0){
            int n=Integer.parseInt(in.readLine());
            System.out.println(solveNQueens(n));
        }
    }
     static List<List<String>> a = new ArrayList<>();
    public static List<List<String>> solveNQueens(int n) {
        List<String> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            StringBuilder sb = new StringBuilder("");
            for(int j=0;j<n;j++){
                sb.append(".");
            }
            res.add(sb.toString());
        }
        back(0,res);
        return a;
    }
    public static void back(int ind,List<String> res){
        if(ind==res.size()){
            a.add(new ArrayList<>(res));
            return;
        }
        for(int i=0;i<res.size();i++){
            if(isValid(res,ind,i)){
                StringBuilder nr= new StringBuilder(res.get(ind));
                nr.setCharAt(i,'Q');
                res.set(ind,nr.toString());
                back(ind+1,res);
                nr.setCharAt(i,'.');
                res.set(ind,nr.toString());
            }
        }
    }
    public static boolean isValid(List<String> res,int r,int c){
        for(int i=r;i>=0;i--){
            if(res.get(i).charAt(c)=='Q'){
                return false;
            }
        }
        for(int i=r,j=c;i>=0&&j>=0;i--,j--){
            if(res.get(i).charAt(j)=='Q'){
                return false;
            }
        }
        for(int i=r,j=c;i>=0&&j<res.size();i--,j++){
            if(res.get(i).charAt(j)=='Q'){
                return false;
            }
        }
        return true;
    }
}