#include<stdio.h>
int subtract(int x,int y);
int main(){
    int n1,n2,result;
    scanf("%d",&n1);
    scanf("%d",&n2);
    result=subtract(n1,n2);
    printf("%d",result);
    return 0;
}
int subtract(int x,int y){
    int result1=x-y;
    return result1;
}



 