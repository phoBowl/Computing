import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] array =new int[size];
        for(int i =0; i<size; i++){
            array[i] = in.nextInt();
        }
        Arrays.sort(array);
        
        int counter =0;
        for(int i = 0; i < size-1; i++){
            if(array[i]==array[i+1]){ 
                counter++;
                break;
            }
        }
        if(counter == 0){ 
            System.out.println("YES");
        }else {
            System.out.println("NO");
          }
    }
}
