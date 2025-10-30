/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package estrutura.forr;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author junio
 */
public class mainCinco {

    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("fatorial não defenido para numeros nagativos");
        } else if (n == 0) {
            n = n + 1;
            System.out.println(n);
        } else {
            int resultado = 1;
            for( int i =1; i<=n;i++){
                resultado = resultado * i;
            }
            System.out.println(resultado);
        }

    }
}
