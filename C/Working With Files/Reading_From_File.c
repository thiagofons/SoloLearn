#include <stdio.h>

int main(void){
    FILE *fptr;
    int c, stock;
    char buffer[200], item[100];
    float price;

    fptr = fopen("myfile.txt", "r");

    fgets(buffer, 20, fptr);
    printf("%s\n", buffer);     // Read "Inventory"

    fscanf(fptr, "%d%s%f", &stock, item, &price);   // Read data
    printf("%d %s %4.2f\n", stock, item, price);

    while((c = getc(fptr) != EOF))  // Read the rest of the file
        printf("%c", c);    

    fclose(fptr);
    return 0;
}