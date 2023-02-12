//Given an array arr of N integers, write a function that returns true if there is a triplet (a, b, c) that satisfies a2 + b2 = c2, otherwise false.
//Input:
//N = 5
//Arr[] = {3, 2, 4, 6, 5}
//Output: Yes
//Explanation: a=3, b=4, and c=5 forms a pythagorean triplet.


//Code:-
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            boolean ans = new Solution().checkTriplet(arr, n);
            System.out.println(ans ? "Yes" : "No");
        }
    }
}
class Solution {
    boolean checkTriplet(int[] arr, int n) {
        // code here
        for(int i=0; i<n ;i++)
        {
            arr[i] = arr[i]*arr[i];
        }
        Arrays.sort(arr);
        int end = n-1;
        int j=1;
        for(int i=0; i<j; i++)
        {
            for(j=i+1; j<end; j++)
            {
                if(arr[i]+arr[j]==arr[end])
                {
                    return true;
                }
                else if(j==end-1 && i==end-2){
                    end--;
                    i=0;
                    j=i;
                }
                
            }
        }
        return false;
    }
}
