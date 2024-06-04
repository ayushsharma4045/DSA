/*
 * Problem Link: https://www.geeksforgeeks.org/problems/swapping-pairs-make-sum-equal4142/1#:~:text=Swapping%20pairs%20make%20sum%20equal
 */
import java.io.*;
import java.util.*;
class Solution {
    long findSwapValues(long a[], int n, long b[], int m) {
        // Your code goes here
        Arrays.sort(a);
        Arrays.sort(b);
        long s1=0;
        long s2=0;
        for(int i=0;i<n;i++){
            s1+=a[i];
        }
        for(int i=0;i<m;i++){
            s2+=b[i];
        }
        int i=0,j=0;
        while(i<n && j<m){
            if(s1-a[i]+b[j] == s2-b[j]+a[i]){
                return 1;
            }
            else if(s1-a[i]+b[j] > s2-b[j]+a[i]){
                i++;
            }
            else{
                j++;
            }
        }
        return -1;
    }
}
class Array {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcases = Integer.parseInt(br.readLine());
        while (testcases-- > 0) {
            String line = br.readLine();
            String[] q = line.trim().split("\\s+");
            int n = Integer.parseInt(q[0]);
            int m = Integer.parseInt(q[1]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(a1[i]);
            }
            String line2 = br.readLine();
            String[] a2 = line2.trim().split("\\s+");
            long b[] = new long[m];
            for (int i = 0; i < m; i++) {
                b[i] = Long.parseLong(a2[i]);
            }
            Solution ob = new Solution();
            long ans = ob.findSwapValues(a, n, b, m);
            System.out.println(ans);
        }
    }
}