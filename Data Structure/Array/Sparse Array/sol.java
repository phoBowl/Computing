import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String nS = in.nextLine();
        int n = Integer.parseInt(nS);
        String [] array = new String[n]; 
        for(int i = 0 ; i < n; i++){
           array[i] = in.nextLine();    
        }
        
        String mS = in.nextLine();
        int m = Integer.parseInt(mS);
        for(int i =0; i < m; i++){
            int counter =0;
            String str = in.nextLine();
            for(int j =0; j < n; j++){
                if(str.equals(array[j])) counter++;
            }
            System.out.println(counter);
        }
        
    }
}