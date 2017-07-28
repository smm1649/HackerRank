John's clothing store has a pile of n loose socks where each sock i is labeled with an integer,ci , denoting its color. 
He wants to sell as many socks as possible, but his customers will only buy them in matching pairs.
Two socks,i  and j, are a single matching pair if ci=cj.
Given  and the color of each sock, how many pairs of socks can John sell?

Input Format
The first line contains an integer, , denoting the number of socks. 
The second line contains  space-separated integers describing the respective values of .

Constraints
Output Format

Print the total number of matching pairs of socks that John can sell.

Sample Input

9
10 20 20 10 10 30 50 10 20

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MatchingPair {

    static int sockMerchant(int n, int[] ar) {
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
