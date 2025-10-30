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
public class mainQuarto {

    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double divisao = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (b == 0) {
                System.out.println("divisão impossivel");
            } else {

                divisao = (double) a / b;
                System.out.printf("%.1f", divisao);
            }

        }

        sc.close();
    }
}
