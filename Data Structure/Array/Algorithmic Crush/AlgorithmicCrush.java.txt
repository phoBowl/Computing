import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int opNum = in.nextInt();
        
        //initialise array
        long [] array = new long[size+1];
        for(int i = 0 ; i < size; i++){
            array[i] = 0;
        }
        
        //initialise operations
        for(int j = 0 ; j < opNum ; j++){
            int a = in.nextInt();
            int b = in.nextInt();
            int k = in.nextInt();
            array[a-1] += k;
            array[b]   -= k;
              
        }
        
        //find  max
        long max = 0;
        long sum = 0;
        for(int i = 0; i <size; i++) {
             sum+=array[i];
             max = Math.max(sum,max);
        }
        System.out.println(max);   
    }
}