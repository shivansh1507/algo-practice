#include<stdio.h>
void main(){
   int percent;
    scanf("%d",&percent);
    if(percent>90)
    {
        printf("A+ Grade");
    }
     else if(percent>75 && percent<=90)
     {
         printf("A Grade");
         
     } 
     else if(percent>60 && percent<=75)
     {
         printf("B Grade");
     }
      else if(percent>40 && percent<=60)
      {
          printf("C Grade");
      }
      else if(percent>30 && percent<=40)
      {
          printf("D Grade");
          
      }
      else if(percent<30)
      {
          printf("Fail");
      }
}

