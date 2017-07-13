public class Solution {
    // Write your code here.
    Queue<Character> queue;// = new Queue<Character>();
    Stack<Character> stack;// = new Stack<Character>();
    
    public Solution(){
        queue = new LinkedList<Character>();
        stack = new Stack<Character>();
    }
    public void pushCharacter(char ch){
        stack.push(ch);
    }
    
    public void enqueueCharacter(char ch){
        queue.add(ch);
    }
    
    public char popCharacter() {
        char rt = stack.peek();
        stack.pop();
        return rt;
    }
    
    public char dequeueCharacter(){
        char rt = queue.peek();
        queue.remove();
        return rt;
    }
