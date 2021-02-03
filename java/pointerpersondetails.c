#include<stdio.h>
struct person{
    char Name[50];
    int age;
    float Wt;
};
int main(){
    struct person*personPtr,person1;
    personPtr=&person1;
    scanf("%s",&personPtr->Name);
    scanf("%d",&personPtr->age);
    scanf("%f",&personPtr->Wt);
    printf("%s\n",personPtr->Name);
    printf("%d\n",personPtr->age);
    printf("%.2f\n",personPtr->Wt);
    return 0;
}

