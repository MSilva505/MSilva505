
package estrutura.sequencial;

import java.util.Scanner;

public class MainTres {

    public static void main(String args[]) {
      
        Scanner sc = new Scanner (System.in);
        int a;
        int b;
        int c;
        int d;
        int diferenca;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        diferenca = (a*b - c*d);
        System.out.println(diferenca);
        
        sc.close();
    }
}
