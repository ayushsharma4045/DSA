/*
 * Problem Link: https://codeforces.com/problemset/problem/4/A
 */
import java.util.Scanner;
 
public class Watermelon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
 
        if (x < 4) {
            System.out.println("NO");
        } 
        else {
            System.out.println(x % 2 == 0 ? "YES" : "NO");
        }
        scanner.close();
    }
}