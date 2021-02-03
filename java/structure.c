#include<stdio.h>
struct node{
    int D1;
    char D2;
    struct node*link;
};
int main(){
    struct node ob1;
    struct node ob2;
    scanf("%d",&ob1.D1);
    scanf("%d",&ob1.D2);
    ob1.link=NULL;
    scanf("%d",&ob2.D1);
    scanf("%d",&ob2.D2);
    ob2.link=NULL;
    ob1.link=&ob2;
    printf("%d %d\n",ob1.D1,ob1.D2);
    printf("%d %d\n",ob1.link->D1,ob1.link->D2);
    return 0;
}