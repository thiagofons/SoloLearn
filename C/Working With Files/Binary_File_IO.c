#include <stdio.h>

int main(void){
    FILE *fptr;
    int arr[10], x[10], k;

    // Generate array of numbers
    for(k = 0; k < 10; k++)
        arr[k] = k;

    // Write array to file
    fptr = fopen("datafile.bin", "wb");
    fwrite(arr, sizeof(arr[0]), sizeof(arr)/sizeof(arr[0]), fptr);
    fclose(fptr);

    // Read array from file
    fptr = fopen("datafile.bin", "rb");
    fread(x, sizeof(arr[0]), sizeof(arr)/sizeof(arr[0]), fptr);
    fclose(fptr);

    // Print array
    for(k = 0; k < 10; k++)
        printf("%d\n", x[k]);

    return 0;
}