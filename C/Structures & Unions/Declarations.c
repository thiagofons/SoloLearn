struct student{
    int age;
    int grade;
    char name[20];
};

int main(void){
    struct student s1;
    
    s1 = (struct student) {.grade = 9, .age = 19, .name = "John"};

    s1 = (struct student) {20, 8, "Carl"};

    s1.age = 20;
    s1.grade = 10;
    s1.name = "Thiago";

    return 0;
}