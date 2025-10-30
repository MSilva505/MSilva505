
package estrutura.condicional;

import java.util.Scanner;

public class MainUm {

    public static void main(String args[]) {
     double numero;
     Scanner sc = new Scanner(System.in);
     System.out.println("DIGITE UM NUMERO");
     numero = sc.nextDouble();
        System.out.println("DIGITE UM NUMERO");
        if (numero<0){
            System.out.println("Numero negativo");
        }else{
            System.out.println("numero positivo");
        }
     
     sc.close();
    }
}
