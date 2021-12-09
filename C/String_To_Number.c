#include <stdio.h>
#include <stdlib.h>

int main(void){
    char input[10];
    float num;

    printf("Enter a number: ");
    gets(input);

    num = atof(input);

    printf("Numero digitado = %f\n", num);

    return 0;
}