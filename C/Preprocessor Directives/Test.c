#include <stdio.h>

#define CONCAT(x, y) x##y

int main(void){
    int x = 4, y = 5;

    int CONCAT(x, y) = x + y;
    printf("%d", xy);

    return 0;
}