#include <stdio.h>

int main(void){
    FILE *fptr;

    fptr = fopen("myfile.txt", "w");
    if(fptr == NULL){
        printf("Error opening file\n");
        return -1;
    }
    fclose(fptr);

    return 0;
}