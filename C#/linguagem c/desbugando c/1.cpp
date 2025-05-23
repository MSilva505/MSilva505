// meter uma media
#include<stdio.h>
int main(){
    int nota1,nota2;
    float media=0;
     printf("\ninserir a primeira nota: ");
     scanf("%d",&nota1);
     printf("\ninserir a segunda nota: ");
     scanf("%d",&nota2);
     media=nota1,nota2/2;
     if(media>=7.0){
         printf("\n aluno foi aprovado com a média: %2.f",media);
     }else{
         printf("\n aluno foi reprovado com a média : %2.f", media);
     }
     return 0;
}
