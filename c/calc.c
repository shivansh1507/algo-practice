#include<stdio.h>
int main(){
    char operator;
   int first,second;
    scanf("%c",&operator);
    scanf("%1i %1i",&first,&second);
    switch(operator){
        case '+':printf("%d",first+second);
        break;
        case '-':printf("%d",first-second);
        break;
        case '*':printf("%d",first*second);
        break;
        case '%':printf("%d",first%second);
        break;
        case '/':printf("%d",first/second);
        break;
        default :
        printf("Invalid output");
    }
    return 0;
    
}