/*
 * Problem Link: https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
 */
import java.util.*;
import java.io.*;
class Solution {
     static List<String> res = new ArrayList<>();
    public static void main(String[] args)throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(in.readLine());
        while(t-->0){
            String digits = in.readLine();
            System.out.println(letterCombinations(digits));
        }
    }
    public static List<String> letterCombinations(String digits) {
        
        if(digits.length()==0){
            return res;
        }
        back(0,new StringBuilder(),digits);
        return res;
    }
    public static void back(int ind,StringBuilder sb,String digits){
        if(ind==digits.length()){
            res.add(sb.toString());
            return;
        }

        String str=findStr(digits.charAt(ind));
        for(int i=0;i<str.length();i++){
            sb.append(str.charAt(i));
            back(ind+1,sb,digits);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public static String findStr(char ch){
        switch(ch){
            case '2':
                return "abc";
            case '3':
                return "def";
            case '4':
                return "ghi";
            case '5':
                return "jkl";
            case '6':
                return "mno";
            case '7':
                return "pqrs";
            case '8':
                return "tuv";
            case '9':
                return "wxyz";
            default:
                return "";
        }
    }
}