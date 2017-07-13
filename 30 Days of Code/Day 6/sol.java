import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        
        int n = Integer.parseInt(in.nextLine());
        String[] array = new String[n];
        
        for(int i = 0 ; i < n ; i++){ 
           array[i] = in.nextLine();
        }
           for(int m = 0 ;  m < n ; m++){
              for(int j = 0; j < array[m].length(); j++){
                  char c = array[m].charAt(j);
                  if(j%2 == 0) System.out.print(c);
                  
              }
               
              System.out.print(" ");
               
              for(int j = 0; j < array[m].length(); j++){
                 char c = array[m].charAt(j);
                 if(j%2 != 0) System.out.print(c);                   
              }
              System.out.println(""); 
           } 
    }
}
