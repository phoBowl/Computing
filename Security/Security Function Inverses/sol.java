import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        for(int i =0; i < size; i++){
            arr[i] = in.nextInt();
        }
        
        int[] inverse = new int[size];
        for(int i = 0 ; i < size; i++){
            int temp = arr[i];
            inverse[temp-1] = i+1;
        }
        
        for(int i = 0 ; i < size ; i++){
            System.out.println(inverse[i]);
        }
    }
}
