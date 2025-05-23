#include <stdio.h>

int main(){
	int A, B, soma, subt, divis, multip;
	
	printf("digite o primeiro valor : \n");
	scanf("%d", &A);
	printf("digite o segundo valor : \n");
	scanf("%d", &B);
	
	 soma = A + B;
	 subt = A - B;
	 divis = A / B;
	 multip = A * B;
	 
	printf("resultados:\n"); 
	printf("soma: %d. \n", soma); 
	printf("subtração: %d. \n", subt); 
	printf("divisão: %d. \n ", divis); 
	printf("Multiplicação: %d. \n", multip);
}
