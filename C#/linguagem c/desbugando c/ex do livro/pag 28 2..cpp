#include<stdio.h>
#include<math.h>
int main(){
    int nota1=0,nota2=0,nota3=0;
    float media=0,notaexame=0;
     
     printf("\ndigite a primeira nota: ");
     scanf("%d", &nota1);
     printf("\ndigite a segunda nota: ");
     scanf("%d", &nota2);
     printf("\ndigite a terceira  nota: ");
     scanf("%d", &nota3);
     media =(nota1+nota2+nota3)/3;
     if(media>=0.0 && media<=3.0){
         printf("\n o aluno obteve a media:%2.f e está reprovado");
     }
      if(media>=3.0 && media<=7.0){
         printf("\n o aluno obteve a media:%2.f e terá que fazer o exame");
         notaexame=12-media;
         printf("\n o aluno precisará de %2.f para ser aprovado ", notaexame);
     }
     if(media>=7.0 && media<=10.0){
         printf("\n o aluno obteve a media:%2.f e está aprovado");
     }
     return 0;
}
