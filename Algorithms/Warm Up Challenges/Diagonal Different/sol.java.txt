import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        //System.out.println(N);
        int[][] array = new int[N][N];
        for(int i = 0 ; i < N ; i++){
            for(int j =0 ; j < N; j++){
                 int val = in.nextInt();
                 array[i][j] = val;         
            }   
        }
        int sum1 = 0;
        for(int i = 0 ; i < N ; i++){
            sum1+= array[i][i];
        }
        //System.out.println(sum1);
        int sum2 = 0;
        int tempCol =N-1;
        for(int i =0 ; i < N ; i++){
            sum2+= array[i][tempCol];
            tempCol--;
        }
        //System.out.println(sum2);
        sum1 = Math.abs(sum1-sum2);
        System.out.println(sum1);
    }
}