#include <stdio.h>

int add(int a, int b);
int subtract(int a, int b);
int multiply(int a, int b);
int divide(int a, int b);

int main(void){
    int x, y, choice, result;
    int (*op[4])(int, int);

    op[0] = add;
    op[1] = subtract;
    op[2] = multiply;
    op[3] = divide;

    printf("Enter 2 integers: ");
    scanf("%d%d", &x, &y);

    printf("Enter 0 to add, 1 to subtract, 2 to multiply or 3 to divide: ");
    scanf("%d", &choice);

    result = op[choice](x, y);

    printf("\nResult = %d\n", result);

    return 0;
}

int add(int a, int b){
    return (a + b);
}

int subtract(int a, int b){
    return (a - b);
}

int multiply(int a, int b){
    return (a * b);
}

int divide(int a, int b){
    return (a / b);
}

