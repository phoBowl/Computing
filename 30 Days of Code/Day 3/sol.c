#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main(){
    int N; 
    scanf("%d",&N);
    if(N%2!=0) printf("Weird");
    else if(N >=2 && N<=5 && N%2 == 0) printf("Not Weird");
    else if(N>=6 && N<=20 && N%2 == 0) printf("Weird");
    else printf("Not Weird");
    return 0;
}
