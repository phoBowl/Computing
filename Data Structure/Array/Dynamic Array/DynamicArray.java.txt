import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
      /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        List<Integer> [] seqList = new List[n];
        for(int i = 0; i < n ; i ++){
            seqList[i] = new ArrayList<Integer>();
        }
        int lastAnswer = 0;
        for(int j = 0; j < q ; j++){
            int k = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            List<Integer> sq = seqList[(x^lastAnswer)%n];
            if(k == 1){
                sq.add(y);
            }
            if(k == 2){
                lastAnswer = seqList[(x^lastAnswer)%n].get(y%sq.size());
                System.out.println(lastAnswer);
            }
        }
        
    }
}