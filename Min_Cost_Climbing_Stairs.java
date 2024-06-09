/*
 * Problem Link: https://leetcode.com/problems/min-cost-climbing-stairs/description/
 */
import java.util.*;
import java.io.*;
public class Min_Cost_Climbing_Stairs {
    public static void main(String args[])throws IOException{
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s[] = sc.nextLine().trim().split(" ");
            int n[] = new int[s.length];
            for(int i=0;i<s.length;i++){
                n[i]=Integer.parseInt(s[i]);
            }
            System.out.println(minCostClimbingStairs(n));
        }
        sc.close();
    }
    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        for (int i = n - 3; i >= 0; i--) {
            cost[i] += Math.min(cost[i + 1], cost[i + 2]);
        }
        return Math.min(cost[0], cost[1]);
    }
}
