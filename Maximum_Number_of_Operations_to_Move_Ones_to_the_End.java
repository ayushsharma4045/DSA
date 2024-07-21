/*
 * Problem Link: https://leetcode.com/problems/maximum-number-of-operations-to-move-ones-to-the-end/
 */
import java.io.*;
import java.util.*;

public class Maximum_Number_of_Operations_to_Move_Ones_to_the_End {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(maxOperations(s));
        sc.close();
    }

    public static int maxOperations(String s) {
        int res = 0,count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '0'){
                res+=count;
                while(i<s.length() && s.charAt(i) != '1') i++;
            }
            count++;
        }
        return res;
    }   
}
