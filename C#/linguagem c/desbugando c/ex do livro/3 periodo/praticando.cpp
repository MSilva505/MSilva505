#include<stdio.h>
int main(){
	int vetor[3];
	int matriz[3][3];
	int i=0;
	int j=0;
	int k=0;
	printf("inserir os dados do vetor \n");
	for(k=0;k<3;k++){
	printf("elemento[%d]:\n",k);
	scanf("%d\n",&vetor[k]);
}
printf(" inserir os dados da matriz que multiplicara os dados do vetor\n");
for(i=0;i<3;i++){
	for(j=0;j<3;j++){
		printf("elemento[%d][d]:\n",i,j);
		scanf("%d",&matriz[i][j]);
	}
	
}

}
