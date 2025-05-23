#include<stdio.h>
int main(){
	int i ;
	float numeros [20];
	 for (i = 0; i < 20; i++) {
        printf("Digite um número positivo: ");
        scanf("%f", &numeros[i]);
        while (numeros[i] < 0) {
            printf("Por favor, digite um número positivo: ");
            scanf("%f", &numeros[i]);
        }
    }
    
}
