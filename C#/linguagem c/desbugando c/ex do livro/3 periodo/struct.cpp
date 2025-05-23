#include<stdio.h>
int main() {
    int matriz[3][3];
    int multidamatriz[3][3];
    int i, j;

    printf("Insira os elementos da matriz:\n");

    for (i = 0; i < 3; i++) {
        for (j = 0; j < 3; j++) {
            printf("Elemento [%d][%d]: ", i, j);
            scanf("%d", &matriz[i][j]);
        }
    }

    for (i = 0; i < 3; i++) {
        for (j = 0; j < 3; j++) {
            multidamatriz[i][j] = matriz[i][j] * 5;
        }
    }

    printf("Os elementos da matriz multiplicados por 5:\n");
    for (i = 0; i < 3; i++) {
        for (j = 0; j < 3; j++) {
            printf("%d ", multidamatriz[i][j]);
        }
        printf("\n");
    }

    return 0;
}

