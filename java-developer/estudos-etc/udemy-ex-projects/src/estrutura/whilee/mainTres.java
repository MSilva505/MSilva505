package estrutura.whilee;

import java.util.Scanner;

public class mainTres {

    public static void main(String args[]) {

        int opcao;
        int qtdGasolina = 0;
        int qtdAlcool = 0;
        int qtdDiesel = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Caro cliente escolha uma opcao 1. Gasolina 2. Alcool 3. Diesel 4. Fim");
        opcao = sc.nextInt();
        while (opcao != 4) {
            if (opcao == 1) {
                qtdGasolina++;
            } else if (opcao == 2) {
                qtdAlcool++;
            } else if (opcao == 3) {
                qtdDiesel++;
            } else {
                System.out.println("");
            }
            opcao = sc.nextInt();
        }
        	System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + qtdAlcool);
		System.out.println("Gasolina: " + qtdGasolina);
		System.out.println("Diesel: " + qtdDiesel);
        sc.close();
    }
}
