#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct{
    int id;
    char name[20];
}ITEM;

int main(void){
    FILE *fptr;
    ITEM first, second, secondf;

    // Create records
    first.id = 10276;
    strcpy(first.name, "Widget");

    second.id = 11786;
    strcpy(second.name, "Gadget");

    // Write records to a file
    fptr = fopen("info.dat", "wb");

    fwrite(&first, 1, sizeof(first), fptr);
    fwrite(&second, 1, sizeof(second), fptr);

    fclose(fptr);

    // File contains 2 records of type item
    fptr = fopen("info.dat", "rb");

    // Seek second record
    fseek(fptr, 1 * sizeof(ITEM), SEEK_SET);
    fread(&secondf, 1, sizeof(ITEM), fptr);

    printf("%d %s\n", secondf.id, secondf.name);

    // Close the file
    fclose(fptr);

    return 0;
}