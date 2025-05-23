#include<stdio.h>
int main(){
	int i,j,matriz[5][5];
	
	printf(" digitir os elementos\n ");
	
	for(i=0;i<5;i++){
		for(j=0;j<5;j++){
			printf(" insirar a informação do elemento [%d][%d]",i,j);
			scanf("%d",&matriz[i][j]);
		}
	}
	for(i=0;i<5;i++){
		for(j=0;j<5;j++){
			printf("elementos [%d][%d]= %d\n\n",i,j,matriz[i][j]);
		}
	}
	return 0;
	}
