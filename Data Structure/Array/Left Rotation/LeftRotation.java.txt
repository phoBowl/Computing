import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // size
        int rotNum = in.nextInt(); //number of rotation
        int [] A = new int[n];
        for(int i = 0 ; i < n; i++){
            A[i] = in.nextInt();
           // System.out.print(A[i]);
        }
        for(int j = 0 ; j < rotNum ; j++){
            rotateLeft(A,n);
        }
        for(int m = 0; m < n; m++){
           System.out.print(A[m]+" ");
       }
    }
    public static void rotateLeft(int[] array,int size){
            int temp = array[0];
            for(int k = 0 ; k < size-1 ; k++){
                array[k] = array[k+1]; 
            }   
            array[size-1] = temp;
   }
    

}