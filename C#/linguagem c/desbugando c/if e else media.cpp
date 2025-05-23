#include<stdio.h>

int main(){
	float m;
	
	printf(" insira a nota:\n");
	scanf("%f", &m);
	
	if (m < 7.0){
	 printf("reprovado!\n");
} else {
	printf("aprovado(a)!\n");
}
}
