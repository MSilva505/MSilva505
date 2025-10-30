package exerciocioestatico.applicacao;

import exerciocioestatico.calculadora.DolarParaReal;
import static exerciocioestatico.calculadora.DolarParaReal.IOF;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String args[]) {
       
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); 
        System.out.println("Qual o preco do dolar?");
        System.out.println("Qual sera as quantidades dos dolars ?");
        double precoDoDolar = sc.nextDouble();
        double qtdDosDolars =sc.nextDouble();
        double precoFinal = DolarParaReal.pagamentoFinal();
        DolarParaReal.multiplicacaoDosDolars(precoDoDolar, qtdDosDolars);
        DolarParaReal.taxaDaIof();
        System.out.println("voce tera que pague isso (taxa da iof ja incluso)");
        System.out.println(DolarParaReal.pagamentoFinal());
     
    }
}
