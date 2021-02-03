#include<stdio.h>
struct student{
    int roll;
    char FirstName[50];
    float marks;
}
s[2];
int main(){
    int i;
    for(i=0;i<2;i++){
        scanf("%d",&s[i].roll);
        scanf("%s",&s[i].FirstName);
        scanf("%f",&s[i].marks);
    }
    for(i=0;i<2;i++){
        printf("%d\n",s[i].roll);
        puts(s[i].FirstName);
        printf("%.2f\n",s[i].marks);
    }
    return 0;
}