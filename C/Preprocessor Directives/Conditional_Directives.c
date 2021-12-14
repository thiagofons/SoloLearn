#include <stdio.h>

#define RATE 0.08
#ifndef TERM
    #define TERM 24
#endif

int main(void){
    #ifdef RATE
        #undef RATE
        printf("Redefining RATE\n");

        #define RATE 0.068
    
    #else
        #define RATE 0.068
    #endif

    printf("%f %d\n", RATE, TERM);

    return 0;
}