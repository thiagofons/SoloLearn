#include <stdio.h>
#include <stdlib.h>

int compare(const void *elem1, const void *elem2){
    if(*(int *)elem1 == *(int *)elem2)
        return 0;
    else if(*(int *)elem1 < *(int *)elem2)
        return -1;
    else
        return 1;
}

void print_array(int *arr, int n){
    for(int i = 0; i < n; i++)
        printf("a[%d] = %d\n", i, arr[i]);
}

int main(void){
    int arr[5] = {52, 23, 56, 19, 4};

    printf("Unordered array:\n");
    print_array(arr, 5);

    qsort((void  *)arr, 5, sizeof(int), compare);

    printf("Ordered array:\n");
    print_array(arr, 5);

    return 0;
}
