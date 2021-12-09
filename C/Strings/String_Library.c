#include <stdio.h>
#include <string.h>

int main(){
    char s1[] = "The grew fox";
    char s2[] = " jumped.";

    strcat(s1, s2);
    printf("%s\n", s1);

    printf("Tamanho de s1 = %d\n", strlen(s1));

    strcpy(s1, s2);
    printf("Novo tamanho = %d\n", strlen(s1));

    return 0;
}