/*
 * Problem Link: https://leetcode.com/problems/combination-sum/description/
 */
import java.util.*;
import java.io.*;
class Solution {
    public static void main(String args[]) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(in.readLine());
        String s[] = in.readLine().split(" ");
        int candidates[]=new int [s.length];
        for(int i=0;i<candidates.length;i++){
            candidates[i]=Integer.parseInt(s[i]);
        }
        System.out.println(combinationSum(candidates,t));
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        back(0,candidates,target,res,new ArrayList<Integer>());
        return res; 
    }
    public static void back(int index,int [] candidates,int target, List<List<Integer>> res,List<Integer> temp){
        if(index==candidates.length){
            if(target==0){
                res.add(new ArrayList<>(temp));
            }
            return;
        }
        if(candidates[index]<=target){
            temp.add(candidates[index]);
            back(index,candidates,target-candidates[index],res,temp);
            temp.remove(temp.size()-1);
        }
        back(index+1,candidates,target,res,temp);
    }
}