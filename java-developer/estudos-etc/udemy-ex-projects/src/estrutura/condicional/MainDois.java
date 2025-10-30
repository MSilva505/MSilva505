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
public class MainDois {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     double numero;
     Scanner sc = new Scanner(System.in);
     System.out.println("DIGITE UM NUMERO");
     numero = sc.nextDouble();
        if (numero % 2 == 0){
            System.out.println("Numero par");
        }else{
            System.out.println("numero impar");
        }
     
     sc.close();
    }
}
