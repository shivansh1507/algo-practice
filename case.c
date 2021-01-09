#include<stdio.h>
int add,sub,divi,mul,mod(int x, int y);
void main(){
    int a,b;
    char op;
    scanf("%c",&op);
    scanf("%d %d",&a,&b);
    switch (op){
        case '+':printf("%d",a+b);
        break;
        case '-':printf("%d",a-b);
        break;
        case '*': printf("%d",a*b);
        break;
        case '/':printf("%d",a/b);
        break;
        case '%':printf("%d",a%b);
        break;
        default :printf("Invalid operator");
        break;
    }
    int add(int x,int y){
        return(x+y);
    }
    int sub(int x,int y){
        return(x-y);
    }
    int mul(int x, int y){
        return(x*y);
    }
    int divi(int x,int y){
        return(x/y);
    }
    int mod(int x,int y){
        return(x%y);
    }
}