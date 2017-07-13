#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
int factorial(int n );
int main() {
    
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    int inp;
    scanf("%d",&inp);
    
    printf("%d",factorial(inp));
    return 0;
}
int factorial(int n ){
   // int result =1;
    if(n <= 1) return 1;
    return n*factorial(n-1);
}
