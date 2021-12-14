#include <stdio.h>
#include <stdlib.h>

int main(void){
    int x = 10, y = 0;

    if(y != 0)
        printf("x / y = %d\n", x/y);
    else{
        printf("Divisor is 0. Program Exiting.");
        exit(EXIT_FAILURE);
    }

    return 0;   
}