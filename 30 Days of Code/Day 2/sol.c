#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main(int argc,char*argv[]) {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    double price;
    double tip;
    double tax;
    
    scanf("%lf",&price);
    scanf("%lf",&tip);
    scanf("%lf",&tax);
    tip = tip/100;
    tax = tax/100;
    double sum = price + price*tip + price*tax;
    sum = round(sum);
    printf("The total meal cost is %.0lf dollars.",sum);
    
    return 0;
}
