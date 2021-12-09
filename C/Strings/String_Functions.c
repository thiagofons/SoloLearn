#include <stdio.h>

void empregados(void){
    char info[100];
    char dept[] = "HR";
    int emp = 75;

    sprintf(info, "The %s dept has %d employees.", dept, emp);
    printf("%s", info);
}

void cidade(void){
    char info[] = "Snoqualmie WA 13190";
    char city[50];
    char state[50];
    int population;

    sscanf(info, "%s %s %d", city, state, &population);
    printf("%d pessoas moram em %s, %s.", population, city, state);
}

int main(void){
    //empregados();

    cidade();

    return 0;
}