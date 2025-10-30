
package exercicio.estrutura;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String args[]) {
        
       Scanner sc = new Scanner (System.in);
        int a = 0;
        int b =0;
        int soma;
        sc.nextInt(a);
        sc.nextInt(b);
        System.out.println(a);
        System.out.println(b);
        soma = a + b;
        System.out.println(soma);
        
        sc.close();
    }
}
