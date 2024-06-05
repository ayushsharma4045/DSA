/*
 * Problem Link: https://leetcode.com/problems/palindrome-partitioning/
 */
import java.io.*;
import java.util.*;
class Solution {
    public static void main(String[] args)throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(in.readLine());
        while(t-->0){
            String s=in.readLine();
            System.out.println(partition(s));
        }
    }
    public static List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        back(0,s,res,new ArrayList<>());
        return res; 
    }
    public static void back(int ind,String s, List<List<String>> res,List<String> temp){
        if(ind==s.length()){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=ind+1;i<=s.length();i++){
            String curr = s.substring(ind,i);
            if(isPalindrome(curr)){
                temp.add(curr);
                back(i,s,res,temp);
                temp.remove(temp.size()-1);
            }
        }
    }
    public static boolean isPalindrome(String c){
        int i=0,j=c.length()-1;
        while(i<j){
            if(c.charAt(i)!=c.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}