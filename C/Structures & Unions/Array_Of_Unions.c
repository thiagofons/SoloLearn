#include <stdio.h>

union val{
    int int_num;
    float fl_num;
    char str[20];
};

union type{
    int i_val;
    float f_val;
    char ch_val;
};

int main(void){
    union val nums[10];
    int k;

    for(k = 0; k < 10; k++){
        nums[k].int_num = k;
        printf("%d ", nums[k].int_num);
    }

    union type arr[3];
    
    arr[0].i_val = 42;
    arr[1].f_val = 3.14;
    arr[2].ch_val = 'x';



    return 0;
}