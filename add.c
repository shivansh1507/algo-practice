#include<stdio.h>
void add(int x, int y);
int main(){
    int n1,n2;
    scanf("%d",&n1);
    scanf("%d",&n2);
    add (n1,n2);
    return 0;
}
void add(int x,int y){
    printf("%d",(x+y));
}

