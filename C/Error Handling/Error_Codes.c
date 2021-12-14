#include <stdio.h>
#include <stdlib.h>
#include <errno.h>

int main(void){

    for(int i = 0; i < 135; i++)
        fprintf(stderr, "%d: %s\n", i, strerror(i));

    return 0;
}