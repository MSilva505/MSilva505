#include<stdio.h>
 int main(){
int i=0,j=0,matriz[15][15];

printf(" \ninserir os dados da matriz ");

for(i=0;i<15;i++){
    for(j=0;j<15;j++){
        printf("\n elementos [%d][%d]", i,j);
        scanf("%d",&matriz[i][j]);
        
    }
}
for(i=0;i<15;i++){
    for(j=0;j<15;j++){
        
        printf("\n os elementos da matriz[%d][%d] = %d",i, j,matriz[ i ][ j ]);
    }
}    
return 0;
}
