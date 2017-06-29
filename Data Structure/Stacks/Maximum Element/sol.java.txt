import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int n = in.nextInt(); //number of queries
       int max = 0;
       Stack<Integer> stack = new Stack<Integer>(); 
       Stack<Integer> maxStack = new Stack<Integer>();
       for(int i = 0 ; i < n ; i++){
           int type = in.nextInt();
           if(type == 1){
              int val = in.nextInt();
              stack.push(val);
              if(maxStack.isEmpty() || val >= maxStack.peek()){
                  maxStack.push(val);
              }
           }else if(type  == 2){ 
               int popVal = stack.peek();
               stack.pop();
               if(popVal == maxStack.peek()) maxStack.pop();
           }
           else if(type == 3) {
               System.out.println(maxStack.peek());
           }
           
       }
    }
    
    public static void findMax(Stack stack){
        Stack cl = (Stack) stack.clone();
        Collections.sort(cl);
        System.out.println(cl.get(cl.size()-1));
    }
}