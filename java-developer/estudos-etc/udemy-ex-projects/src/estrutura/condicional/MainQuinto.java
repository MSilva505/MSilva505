
package estrutura.condicional;

import java.util.Scanner;

public class MainQuinto {

    
    public static void main(String args[]) {
     int codigo;
     int quantidade;
     double total;
     Scanner sc = new Scanner (System.in);
        System.out.println("DIGITE O CODIGO E DEPOIS A QUANTIDADES");
        codigo = sc.nextInt();
        quantidade = sc.nextInt();
            if( codigo == 1 ){
               total = quantidade * 4.50;
                System.out.printf( "TOTAL DOS ITENS: %.2f ",total);
            }
            else if( codigo == 2 ){
               total = quantidade * 2.00;
                System.out.printf( "TOTAL DOS ITENS: %.2f ",total);
            }
            else if( codigo == 3){
               total = quantidade * 5.00;
                System.out.printf( "TOTAL DOS ITENS: %.2f ",total);
            }
            else if( codigo == 4 ){
               total = quantidade * 3.00;
                System.out.printf( "TOTAL DOS ITENS: %.2f ",total);
            }
            else if( codigo == 5 ){
               total = quantidade * 1.00;
                System.out.printf( "TOTAL DOS ITENS: %.2f ",total);
            }else{
                System.out.println("NUMERO INVALIDO");
                
            }
           
     sc.close();
     
     
    }
}
