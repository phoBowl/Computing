import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            System.out.println(isBalance(s));       
        }
    }
    
    public static String isBalance(String s){
        Stack<Character> stack = new Stack<Character>();
        int firstVal = '\0';
        for(int i = 0 ; i< s.length(); i++){
            if(!stack.isEmpty()) firstVal = stack.peek();
            stack.push(s.charAt(i));
            if(stack.size()>1 && !stack.isEmpty()){
                if((firstVal == '[' && stack.peek() == ']' )|| (firstVal == '(' && stack.peek() ==')') || (firstVal == '{' && stack.peek() =='}')){
                    stack.pop();
                    stack.pop();
                }
            }
        }
        return stack.isEmpty() ? "YES" : "NO";
    }
}
