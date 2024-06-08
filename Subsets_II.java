/*
 * Problem Link: https://leetcode.com/problems/subsets-ii/description/
 */
import java.io.*;
import java.util.*;
class Subsets_II {
    static List<List<Integer>> res = new ArrayList<>();
    public static void main(String[] args)throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s[] = in.readLine().trim().split(" ");
        int nums[] = new int[s.length];
        for(int i=0;i<nums.length;i++){
            nums[i]=Integer.parseInt(s[i]);
        }
        System.out.println(subsetsWithDup(nums));
    }
    
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        back(0,nums,new ArrayList<>());
        return res;
    }
    public static void back(int ind,int[] nums,List<Integer> temp){
        res.add(new ArrayList<>(temp));
        for(int i=ind;i<nums.length;i++){
            if(i>ind && nums[i]==nums[i-1]){
                continue;
            }
            temp.add(nums[i]);
            back(i+1,nums,temp);
            temp.remove(temp.size()-1);
        }
    }
}
