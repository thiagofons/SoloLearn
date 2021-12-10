#include <stdio.h>
#include <string.h>

typedef struct {
    int id;
    char title[40];
    float hours;
} Course;

void update_course(Course* class){
    strcpy(class->title, "C Fundamentals");
    class->id = 111;
    class->hours = 12.30;
}

void display_course(Course* class){
    printf("%d\t%s\t%f\n", class->id, class->title, class->hours);
}

int main(void){
    Course cs2;

    update_course(&cs2);
    display_course(&cs2);

    return 0;
}