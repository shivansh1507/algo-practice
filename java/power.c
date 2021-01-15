#include<stdio.h>
int power(int base,int powerRaised){
    if(powerRaised!=0)
    return (base*power(base,powerRaised-1));
    else
    return 1;
}
int main(){
    int base,powerRaised,result;
    scanf("%d %d",&base,&powerRaised);
    result=power(base,powerRaised);
    printf("%d",result);
    return 0;
}