//Write your code here
 class Calculator{
    private int n;
    private int p;
    
    public int power(int n, int p){
        int result = 1;
        if(n < 0 || p < 0){
           throw new IllegalArgumentException("n and p should be non-negative");
        }
            for(int i =0; i < p; i++){
                result *= n;
            }
            return result;
         
        
        }
}
