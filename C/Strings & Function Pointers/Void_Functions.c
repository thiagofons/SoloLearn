#include <stdio.h>

void *square(const void *num){
    int result = (*(int *)num) * (*(int *)num);

    return result;
}

int main(void){
    int x, sq_int;
    x = 6;
    sq_int = square(&x);

    printf("%d squared is %d\n", x, sq_int);

    return 0;
}