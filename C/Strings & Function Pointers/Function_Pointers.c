#include <stdio.h>

void say_hello(int num_times, char *word){
    int k;
    for(k = 0; k < num_times; k++)
        printf("%s\n", word);
}

int main(void){
    // Ponteiro que aponta para o local da funçao na memoria
    void (*funptr)(int, char*) = say_hello;

    // Execucao da funcao passando os argumentos
    funptr(3, "hello");

    return 0;
}