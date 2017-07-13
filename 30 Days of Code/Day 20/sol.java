import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] A = countSwap(a);
           System.out.println("Array is sorted in " +A[0]+ " swaps.");
            System.out.println("First Element: " + A[1] );
           System.out.println("Last Element: "+A[2]);
     
        
        
        // Write Your Code Here
    }
    
    public static int[] countSwap(int [] a){
        int numberOfSwaps = 0;
        int n = a.length;
        int []  A = new int[3];
        for (int i = 0; i < n; i++) {
         // Track number of elements swapped during a single array traversal
             
    
               for (int j = 0; j < n - 1; j++) {
        // Swap adjacent elements if they are in decreasing order
            if (a[j] > a[j + 1]) {
                //swap(a[j], a[j + 1]);
                int temp = a[j];
                a[j] = a[j+1];
                a[j+1]= temp;
                numberOfSwaps++;
            }
        }
    
        // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }
        A[0] = numberOfSwaps;
        A[1] = a[0];
        A[2] = a[n-1];
        
        return A;
    }
    public static void swap(int a , int b){
        int temp = a;
        a = b;
        b  = temp;
    }
}
