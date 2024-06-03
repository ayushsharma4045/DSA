/*
 * Problem Link: https://leetcode.com/problems/permutations/
 */
import java.util.*;
import java.io.*;
class Solution {
    public static void main(String [] args)throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s[] = in.readLine().split(" ");
        int nums[] = new int[s.length];
        for(int i=0;i<nums.length;i++){
            nums[i]=Integer.parseInt(s[i]);
        }
        System.out.println(permute(nums));
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        back(nums,res,new ArrayList<Integer>());
        return res;
    }
    public static void back(int []nums,List<List<Integer>> res,List<Integer> temp){
        if(temp.size()==nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i:nums){
            if(temp.contains(i)){
                continue;
            }
            temp.add(i);
            back(nums,res,temp);
            temp.remove(temp.size()-1);
        }
    }
}