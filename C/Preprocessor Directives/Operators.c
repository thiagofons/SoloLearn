#include <stdio.h>

#define TO_STR(x) #x
#define VAR(name, num) name##num

int main(void){
    // # operator - convert to string 
    printf("%s\n", TO_STR(123\\12));

    // ## operator - appends tokens together
    int x1 = 125, x2 = 250, x3 = 500;

    printf("%d\n", VAR(x, 3));

    return 0;
}