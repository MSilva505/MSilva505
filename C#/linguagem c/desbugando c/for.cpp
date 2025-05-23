#include<stdio.h>
int main() {
    float numeros[10];
    int i;

    for (i = 0; i < 10; i++) {
        printf("Digite um número positivo: ");
        scanf("%f", &numeros[i]);
        while (numeros[i] < 0) {
            printf("Por favor, digite um número positivo: ");
            scanf("%f", &numeros[i]);
        }
    }

    for (i = 0; i < 10; i++) {
        printf("O dobro de %.2f é %.2f\n", numeros[i], numeros[i]*2);
    }

    return 0;
    
}
