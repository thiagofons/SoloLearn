#include <stdio.h>
#include <stdlib.h>
#include <errno.h>

int main(void){
    FILE* fptr;
    errno = 0;

    fptr = fopen("nonexistingfile.txt", "r");
    if(fptr == NULL){
        perror("Error");
        fprintf(stderr, "%s\n", strerror(errno));
        exit(EXIT_FAILURE);
    }

    return 0;
}