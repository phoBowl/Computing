#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main(){
    int n; 
    scanf("%d",&n);
    int *arr = malloc(sizeof(int) * n);
    for(int arr_i = 0; arr_i < n; arr_i++){
       scanf("%d",&arr[arr_i]);
    }
    /*
    for(int j = 0; j < n; j++){
        int temp = arr[n-1-j];
        arr[n-1-j] = arr[j];
        arr[j] = temp;
    }
    */
    for(int k = n-1; k >= 0;k--){
        printf("%d ",arr[k]);
    }
    return 0;
}
