#include <stdio.h>
int main(){

int a, b, soma, sub, div, mult;

printf("digite o valor 1:\n");
scanf("%d", &a);
printf("digite o valor 2: \n");
scanf("%d", &b);

soma = a + b ;
sub = a - b;
div = a / b;
mult = a * b;

printf(" resultados: \n");
printf("soma: %d. \n", soma);
printf("subtração: %d. \n", sub);
printf(" divisão: %d. \n", div);
printf("multiplicação: %d \n", mult);
}
