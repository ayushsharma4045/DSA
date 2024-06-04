/*
 * Problem Link: https://leetcode.com/problems/combination-sum-ii/
 */
import java.util.*;
import java.io.*;
class Solution {
    public static void main(String args[])throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s[] = in.readLine().trim().split(" ");
        int candidates[] =new int[s.length];
        for(int i=0;i<candidates.length;i++){
            candidates[i]=Integer.parseInt(s[i]);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        back(0, candidates, res, target, new ArrayList<>());
        return res;
    }

    public void back(int ind, int arr[], List<List<Integer>> res, int t, List<Integer> temp) {

        if (t == 0) {
            res.add(new ArrayList<>(temp));
            return;
        }

        for (int i = ind; i < arr.length; i++) {
            if (i > ind && arr[i] == arr[i - 1]) {
                continue;
            }
            if (arr[i] > t) {
                break;
            }
            temp.add(arr[i]);
            back(i + 1, arr, res, t - arr[i], temp);
            temp.remove(temp.size() - 1);
        }
    }
}