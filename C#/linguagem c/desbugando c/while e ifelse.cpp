 #include <stdio.h>
 
 	int main(void){
		int resp;
	float media1,media2,totalmedia;

	
	do{
		printf(" digite a primeira nota\n");
		scanf("%f", &media1);
		printf(" digite a segunda nota \n");
		scanf("%f",&media2);
		
		
		 totalmedia=( media1 + media2)/2;
		printf("media do aluno = %f\n", &totalmedia);
		
		if(totalmedia >= 7){ printf("aluno aprovado\n");
		}else{ printf(" aluno reprovado\n ");
		}
		printf(" aperte 1 para continuar ou 2 para terminar\n");
		scanf("%d", &resp);
	}while (resp==1);

}
