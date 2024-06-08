/*
 * Problem Link: https://leetcode.com/problems/climbing-stairs/
 */
//import java.util.*;
import java.io.*;
class Solution {
    public static void main(String args[])throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(in.readLine());
        while(t-->0){
            int n=Integer.parseInt(in.readLine());
            Solution ob = new Solution();
            System.out.println(ob.climbStairs(n));
        }
    }
    public int climbStairs(int n) {
        if(n==0 || n==1){
            return 1;
        }    
        int pre=1,curr=1;
        for(int i=2;i<=n;i++){
            int t=curr;
            curr=pre+curr;
            pre=t;
        }
        return curr;
    }
}