#include <stdio.h>
#include <stdlib.h>

typedef struct{
    int *elements;
    int size;
    int cap;
} dyn_array;

int main(void){
    dyn_array arr;

    // Iniciaizar o array
    arr.size = 0;
    arr.elements = calloc(1, sizeof(*arr.elements));
    arr.cap = 1;

    // Expandir para mais 5 elementos
    arr.elements = realloc(arr.elements, (5 + arr.cap));
    if(arr.elements != NULL)
        arr.cap += 5;

    // Adicionar um elemento e aumentar o tamanho
    if(arr.size < arr.cap){
        arr.elements[arr.size] = 50;
        arr.size++;
    }
    else{
        printf("Need to expand the array.\n");
    }

    // Exibir os elementos do array
    for(int i = 0; i < arr.cap; i++)
        printf("Element %d = %d\n", i, arr.elements[i]);

    return 0;
}