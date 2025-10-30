
package estrutura.sequencial;

import java.util.Scanner;

public class MainQuarto {

    public static void main(String args[]) {
   
     
    Scanner sc = new Scanner (System.in);
        System.out.println("DIGITE OS DOIS CODIGOS E DEPOIS PRECOS E QUANTIDADES:");
    double pre1,quant1,pre2,quant2,total;
    pre1 = sc.nextDouble();
    quant1 = sc.nextDouble();
    pre2 = sc.nextDouble();
    quant2 = sc.nextDouble();
    total = (pre1*quant1)+(pre2*quant2);
    
    System.out.printf("codigos das pecas:"+253432+"&n"+335638);
        System.out.println("%n");
    System.out.printf("total das compras foram:%.2f ",total);
    
    sc.close();
    }
}
