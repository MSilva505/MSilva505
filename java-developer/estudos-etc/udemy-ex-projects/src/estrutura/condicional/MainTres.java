/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package estrutura.condicional;

import java.util.Scanner;

/**
 *
 * @author junio
 */
public class MainTres {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     int A;
     int B;
     Scanner sc = new Scanner(System.in);
     System.out.println("DIGITE OS DOIS NUMEROS");
        A = sc.nextInt();
        B = sc.nextInt();
        if ( A % B == 0 ){
            System.out.println("SAO MULTIPLOS");
        }else{
            System.out.println("NAO SAO MULTIPLOS");
        }
     
     sc.close();
    }
}
