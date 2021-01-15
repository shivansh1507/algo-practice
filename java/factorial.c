#include<stdio.h>
int factorial(int n){
    if(n!=0)
    return n*factorial(n-1);
    else
    return 1;
}
int main(){
    int number,result;
    scanf("%d",&number);
    result=factorial(number);
    printf("%d",result);
    return 0;
}