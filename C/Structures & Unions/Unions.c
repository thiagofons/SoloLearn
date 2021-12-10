#include <stdio.h>
#include <string.h>

union val{
    int int_num;
    float fl_num;
    char str[20];
};

int main(void){
    union val teste;

    teste.int_num = 123;
    teste.fl_num = 98.76;
    strcpy(teste.str, "hello");

    printf("%d\n", teste.int_num);
    printf("%f\n", teste.fl_num);
    printf("%s\n", teste.str);

    return 0;    
}