#include <stdio.h>

void nome_completo(void){
    char full_name[50];

    printf("Insira o seu nome completo: ");
    gets(full_name);

    printf("Nome completo: %s\n", full_name);
}

void cidade_favorita(void){
    char cidade[40];

    printf("Insira a sua cidade favorita: ");
    gets(cidade);

    fputs(cidade, stdout);
    printf(" eh uma cidade legal\n");
}

int main(void){
    
    nome_completo();

    cidade_favorita();


    return 0;
}