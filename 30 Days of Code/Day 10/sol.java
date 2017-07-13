import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int dec = in.nextInt();
        Stack<Integer> st = new Stack<Integer>();
        int rm = 0;
        while(dec>0){
            rm = dec%2;
            dec = dec/2;
            st.push(rm);
        }
        
        int size = st.size();
        int[] array = new int[size];
        for(int i = 0 ; i < size; i++){
            array[i] = st.pop();
        }
     
        int countOne = 0;
        int maxOne =0;
        for(int j = 0 ; j < size ; j++){
            if(array[j] == 0){
                countOne = 0;  
            } 
            else{
                countOne++;
                maxOne = Math.max(maxOne,countOne);
            }
        }
        System.out.println(maxOne);
    }
}
